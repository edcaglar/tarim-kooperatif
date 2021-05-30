CREATE TABLE uyeler(
      tckn VARCHAR(11) NOT NULL PRIMARY KEY,
      ad VARCHAR(20) NOT NULL,
      soyad VARCHAR(20) NOT NULL,
      tel VARCHAR(10),
      il VARCHAR(20) NOT NULL,
      ilce VARCHAR(20) NOT NULL

);



CREATE TABLE musteriler(
      tckn VARCHAR(11) NOT NULL PRIMARY KEY,
      ad VARCHAR(20) NOT NULL,
      soyad VARCHAR(20) NOT NULL,
      tel VARCHAR(10),
      il VARCHAR(20) NOT NULL,
      ilce VARCHAR(20) NOT NULL
);


CREATE TABLE urunler(
      urunId INT NOT NULL PRIMARY KEY,
      tur VARCHAR(20) NOT NULL
);

CREATE TABLE uretim(
      ureticiTckn VARCHAR(11) NOT NULL,
      urunId INT NOT NULL,
      miktar NUMERIC NOT NULL,
      birimFiyat NUMERIC NOT NULL,
      CONSTRAINT pk_uretim PRIMARY KEY (ureticiTckn, urunId),
      FOREIGN KEY (ureticiTckn) REFERENCES uyeler (tckn) ON DELETE CASCADE,
      FOREIGN KEY (urunId) REFERENCES urunler (urunId)
      );

CREATE TABLE satis(
      satisId SERIAL PRIMARY KEY ,
      uyeTckn VARCHAR(11) NOT NULL,
      musteriTckn VARCHAR(11) NOT NULL,
      urunId INT NOT NULL,
      birimFiyat NUMERIC NOT NULL,
      miktar NUMERIC NOT NULL,
      satisTarihi DATE NOT NULL,
      toplamFiyat NUMERIC GENERATED ALWAYS AS (miktar* birimFiyat) STORED,
      CONSTRAINT play_time_ck CHECK (miktar >= 100),
      FOREIGN KEY (urunId) REFERENCES urunler (urunId),
      FOREIGN KEY (musteriTckn) REFERENCES musteriler (tckn)
);



CREATE VIEW satisView AS SELECT * FROM satis;


CREATE SEQUENCE seq_urunId
MINVALUE 120
MAXVALUE 1000
INCREMENT BY 10;




CREATE OR REPLACE FUNCTION trig_fonk_birimFiyatLimit()
RETURNS TRIGGER AS $$
BEGIN

IF ((new.birimFiyat < old.birimFiyat * 1.5) and (new.birimFiyat > old.birimFiyat * 0.5))
THEN
	RETURN new;
ELSE
	RAISE EXCEPTION '0.5 ten fazla zam veya indirim yapamazsiniz';
	RETURN old;
END IF;



END;
$$ LANGUAGE  'plpgsql';


CREATE  TRIGGER tr1_birimFiyatLimit
BEFORE UPDATE
ON uretim
FOR EACH ROW EXECUTE PROCEDURE trig_fonk_birimFiyatLimit();



CREATE OR REPLACE FUNCTION trig_fonk_miktarLimit()
RETURNS TRIGGER AS $$
BEGIN

IF ((new.miktar + (SELECT sum(miktar) FROM uretim  WHERE new.urunId = urunId))  > 50000 or (new.miktar > 50000))
THEN
	RAISE EXCEPTION 'Bu urunden uretilmis fazla miktar bulundugu icin ekleyemiyorsunuz.
                    Daha kucuk miktarlar eklemeyi deneyin.';
	RETURN NULL;
ELSE
	RETURN new;
END IF;

END;
$$ LANGUAGE  'plpgsql';



CREATE  TRIGGER tr2_birimMiktarLimitOnUpdate
BEFORE UPDATE
ON uretim
FOR EACH ROW EXECUTE PROCEDURE trig_fonk_miktarLimit();


CREATE  TRIGGER tr3_birimMiktarLimitOnInsert
BEFORE INSERT
ON uretim
FOR EACH ROW EXECUTE PROCEDURE trig_fonk_miktarLimit();



CREATE  TYPE satis_log AS (var_uyeTckn varchar(11), var_miktar INT,var_urunId INT,var_satisTarihi DATE);
CREATE OR REPLACE FUNCTION satis_listele(var_tur urunler.tur%TYPE,var_gun INT)
RETURNS satis_log[] AS '
DECLARE
	log_cursor CURSOR FOR SELECT uyeTckn,miktar,s1.urunId,satisTarihi FROM satis s1 WHERE s1.urunId = (SELECT urunId FROM urunler WHERE tur = var_tur);
satis_array satis_log[];
i integer;
BEGIN
    i := 1;
            FOR log_record IN log_cursor LOOP
	  	IF(((SELECT CURRENT_DATE) - log_record.satisTarihi ) <= var_gun)
		THEN
		  satis_array[i] = log_record;
		  i := i + 1;
		END IF;
          END LOOP;    RETURN satis_array;
END;
' LANGUAGE 'plpgsql';



CREATE  or REPLACE FUNCTION toplam_kazanc (var_tckn satis.uyeTckn%type)
RETURNS NUMERIC  AS '
DECLARE
	toplam_kazanc NUMERIC;
BEGIN
SELECT 	sum(toplamFiyat) INTO toplam_kazanc
FROM 	satis
WHERE 	uyeTckn = var_tckn;
		RETURN toplam_kazanc;
END;
' LANGUAGE  plpgsql;



CREATE  or REPLACE FUNCTION ortalama_fiyat(var_tur urunler.tur%type)
RETURNS NUMERIC  AS '
DECLARE
	toplam_fiyat NUMERIC;
	toplam_kilo NUMERIC;
	ortalama_fiyat NUMERIC;
BEGIN
SELECT 	sum(toplamFiyat),sum(miktar) INTO toplam_fiyat,toplam_kilo
FROM 	satis s1,urunler u1
WHERE 	s1.urunId = (SELECT urunId FROM urunler WHERE tur = var_tur);
ortalama_fiyat = toplam_fiyat/toplam_kilo;
		RETURN ortalama_fiyat;
END;
' LANGUAGE  plpgsql;
