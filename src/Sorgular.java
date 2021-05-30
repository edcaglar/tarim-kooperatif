
import java.math.BigDecimal;
import java.sql.*;


public class Sorgular {
	
	
	
	public static void musteriKayit(String s1,String s2,String s3,String s4,String s5,String s6) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "INSERT INTO musteriler(tckn,ad,soyad,tel,il,ilce) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s3);
		p.setString(2,s1);
		p.setString(3,s2);
		p.setString(4,s4);
		p.setString(5,s5);
		p.setString(6,s6);
		
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	public static void ureticiKayit(String s1,String s2,String s3,String s4,String s5,String s6) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "INSERT INTO uyeler (tckn,ad,soyad,tel,il,ilce) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s3);
		p.setString(2,s1);
		p.setString(3,s2);
		p.setString(4,s4);
		p.setString(5,s5);
		p.setString(6,s6);
		
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	
	public static void uyeSil(String s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "DELETE FROM uyeler WHERE tckn = ?";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s1);

		
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	
	public static void birimFiyatGuncelle(String s1,int s2,BigDecimal s3) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "UPDATE uretim SET birimFiyat = ? WHERE ureticiTckn = ? and urunId = ?";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setBigDecimal(1,s3);
		p.setString(2,s1);
		p.setInt(3,s2);

	
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	public static void urunMiktariArtir(String s1,String s2,int s3) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "UPDATE uretim SET miktar = miktar + ? WHERE ureticiTckn= ? and urunId IN(SELECT urunId FROM urunler WHERE tur = ?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setInt(1,s3);
		p.setString(2,s1);
		p.setString(3,s2);

		
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	public static void yeniUrunTipiEkle(String s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "INSERT INTO urunler VALUES(nextval('seq_urunId'),?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s1);

		
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	
	public static void yeniUretimEkle(String s1,int s2,BigDecimal s3, BigDecimal s4) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "INSERT INTO uretim(ureticiTckn,urunId,miktar,birimFiyat) VALUES(?,?,?,?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s1);
		p.setInt(2,s2);
		p.setBigDecimal(3,s3);
		p.setBigDecimal(4,s4);

		
		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	
	public static void satinAl(String s1,String s2,int s3,BigDecimal s4, BigDecimal s5, Date date1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "INSERT INTO satis(uyeTckn,musteriTckn,urunId,birimFiyat,miktar,satisTarihi) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s1);
		p.setString(2,s2);
		p.setInt(3,s3);
		p.setBigDecimal(4,s4);
		p.setBigDecimal(5,s5);
		p.setDate(6, date1);

		p.executeUpdate();
		
		p.close();
		conn.close();
	}
	
	public static ResultSet satisLoglariniListele() throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT * FROM satisView";
		
		Statement s = conn.createStatement();

		
		ResultSet r = s.executeQuery(query);
		
		s.close();
		conn.close();
		return r;
	}
	
	public static ResultSet sorgu16() throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "select tur,count(*) from uretim inner join urunler on uretim.urunid = urunler.urunid group by tur order by count(*)";
		
		Statement s = conn.createStatement();

		
		ResultSet r = s.executeQuery(query);
		
		s.close();
		conn.close();
		return r;
	}
	
	
	public static ResultSet sorgu11(String s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT ad,soyad,miktar,birimFiyat FROM uyeler,uretim WHERE urunId = (SELECT urunId FROM urunler WHERE tur = ?) and tckn = ureticiTckn";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s1);

		ResultSet r = p.executeQuery();
		
		p.close();
		conn.close();
		return r;
	}
	
	public static ResultSet sorgu12(String s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT toplam_kazanc(?)";
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1,s1);

		ResultSet r = p.executeQuery();
		
		p.close();
		conn.close();
		return r;
	}
	
	public static ResultSet sorgu13(BigDecimal s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT tur,sum(miktar) FROM urunler u1,uretim u2 WHERE u1.urunId=u2.urunId GROUP BY tur HAVING sum(miktar) > ?";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setBigDecimal(1, s1);

		ResultSet r = p.executeQuery();
		
		p.close();
		conn.close();
		return r;
	}
	
	public static ResultSet sorgu14(String s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT ortalama_fiyat(?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1, s1);

		ResultSet r = p.executeQuery();
		
		p.close();
		conn.close();
		return r;
	}
	
	
	public static ResultSet sorgu15(String s1, int s2) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT satis_listele(?,?)";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1, s1);
		p.setInt(2, s2);

		ResultSet r = p.executeQuery();

		
		
		p.close();
		conn.close();
		return r;
	}
	
	public static ResultSet sorgu18(String s1) throws SQLException {
		String user, password;
		user = "postgres";
		password = "123456";
		Connection conn = null;
		conn = 	DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kooperatif", user, password);
		
		String query = "SELECT ad,soyad,tel FROM uyeler,uretim WHERE urunId = (SELECT urunId FROM urunler WHERE tur = ?) and ureticiTckn = tckn INTERSECT SELECT ad,soyad,tel FROM uyeler,satis WHERE urunid = (SELECT urunId FROM urunler WHERE tur = ?) and uyeTckn = tckn";
		
		PreparedStatement p = conn.prepareStatement (query);
		p.clearParameters();
		p.setString(1, s1);
		p.setString(2, s1);

		ResultSet r = p.executeQuery();
		
		p.close();
		conn.close();
		return r;
	}
	

}
