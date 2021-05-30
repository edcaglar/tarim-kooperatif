import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
public class frm extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField txt_Isim_UyeKayit;
	private JTextField txt_Soyisim_UyeKayit;
	private JTextField txt_Tckn_UyeKayit;
	private JTextField txt_Telefon_UyeKayit;
	private JTextField txt_Il_UyeKayit;
	private JTextField txt_Ilce_UyeKayit;
	private JTextField txt_Tckn_UyeSil;
	private JTextField txt_Tckn_BirimFiyatGuncelle;
	private JTextField txt_UrunId_BirimFiyatGuncelle;
	private JTextField txt_BirimFiyat_BirimFiyatGuncelle;
	private JTextField txt_Tckn_UrunMiktariArtir;
	private JTextField txt_UrunIsmi_UrunMiktariArtir;
	private JTextField txt_Miktar_UrunMiktariArtir;
	private JTextField txt_UrunTipi_YeniUrunTipiEkle;
	private JTextField txt_UreticiTckn_YeniUretimEkle;
	private JTextField txt_UrunId_YeniUretimEkle;
	private JTextField txt_Miktar_YeniUretimEkle;
	private JTextField txt_BirimFiyat_YeniUretimEkle;
	private JTextField txt_Tarih_YeniUretimEkle;
	private JTextField txt_UreticiTckn_SatinAlimIslemi;
	private JTextField txt_MusteriTckn_SatinAlimIslemi;
	private JTextField txt_UrunId_SatinAlimIslemi;
	private JTextField txt_BirimFiyat_SatinAlimIslemi;
	private JTextField txt_Miktar_SatinAlimIslemi;
	private JTextField txt_SatisTarihi_SatinAlimIslemi;
	private JTable table_11;
	private JTextField txt_UrunAdi_11;
	private JTextField txt_UreticiTckn_12;
	private JTable table_12;
	private JTextField txt_Miktar_13;
	private JTable table_13;
	private JTextField txt_UrunAdi_14;
	private JTextField txtGunSays;
	private JTextField txtTur;
	private JTable table_15;
	private JTable table_16;
	private JTable table_17;
	private JTextField txt_UrunAdi_18;
	private JTable table18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm frame = new frm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 10, 1066, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn_Anasayfa = new JButton("Ana Sayfa");
		btn_Anasayfa.setBackground(Color.GREEN);
		btn_Anasayfa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_Anasayfa.setBounds(948, 10, 88, 26);
		panel.add(btn_Anasayfa);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 70, 1066, 523);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_13642713409800");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TARIM KOOPERATIFI BILGI SISTEMI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(86, 10, 870, 76);
		panel_1.add(lblNewLabel);
		
		JButton btn_UyeKayit = new JButton("UYE KAYIT");
		btn_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_UyeKayit.setBounds(199, 129, 215, 76);
		panel_1.add(btn_UyeKayit);
		
		JButton btn_UyeIslemleri = new JButton("UYE ISLEMLERI");
		btn_UyeIslemleri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_UyeIslemleri.setBounds(679, 129, 215, 76);
		panel_1.add(btn_UyeIslemleri);
		
		JButton btn_Sorgular = new JButton("SORGULAR");
		btn_Sorgular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Sorgular.setBounds(444, 299, 215, 76);
		panel_1.add(btn_Sorgular);
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_14517214104100");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UYE KAYIT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(383, 10, 277, 45);
		panel_2.add(lblNewLabel_1);
		
		txt_Isim_UyeKayit = new JTextField();
		txt_Isim_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_Isim_UyeKayit.setText("ISIM");
		txt_Isim_UyeKayit.setBounds(51, 97, 258, 34);
		panel_2.add(txt_Isim_UyeKayit);
		txt_Isim_UyeKayit.setColumns(10);
		
		txt_Soyisim_UyeKayit = new JTextField();
		txt_Soyisim_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_Soyisim_UyeKayit.setText("SOYISIM");
		txt_Soyisim_UyeKayit.setColumns(10);
		txt_Soyisim_UyeKayit.setBounds(372, 97, 258, 34);
		panel_2.add(txt_Soyisim_UyeKayit);
		
		txt_Tckn_UyeKayit = new JTextField();
		txt_Tckn_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_Tckn_UyeKayit.setText("TCKN");
		txt_Tckn_UyeKayit.setColumns(10);
		txt_Tckn_UyeKayit.setBounds(51, 183, 258, 34);
		panel_2.add(txt_Tckn_UyeKayit);
		
		txt_Telefon_UyeKayit = new JTextField();
		txt_Telefon_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_Telefon_UyeKayit.setText("TELEFON");
		txt_Telefon_UyeKayit.setColumns(10);
		txt_Telefon_UyeKayit.setBounds(372, 183, 258, 34);
		panel_2.add(txt_Telefon_UyeKayit);
		
		txt_Il_UyeKayit = new JTextField();
		txt_Il_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_Il_UyeKayit.setText("IL");
		txt_Il_UyeKayit.setColumns(10);
		txt_Il_UyeKayit.setBounds(51, 266, 258, 34);
		panel_2.add(txt_Il_UyeKayit);
		
		txt_Ilce_UyeKayit = new JTextField();
		txt_Ilce_UyeKayit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txt_Ilce_UyeKayit.setText("ILCE");
		txt_Ilce_UyeKayit.setColumns(10);
		txt_Ilce_UyeKayit.setBounds(372, 266, 258, 34);
		panel_2.add(txt_Ilce_UyeKayit);
		
		JButton btn_MusteriKayit = new JButton("MUSTERI KAYIT");
		btn_MusteriKayit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_MusteriKayit.setBounds(85, 377, 240, 94);
		panel_2.add(btn_MusteriKayit);
		
		JButton btn_UreticiKayit = new JButton("URETICI KAYIT");
		btn_UreticiKayit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_UreticiKayit.setBounds(383, 377, 240, 94);
		panel_2.add(btn_UreticiKayit);
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_15539707930300");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("UYE ISLEMLERI");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_2.setBounds(364, 10, 355, 49);
		panel_3.add(lblNewLabel_2);
		
		JButton btn_UreticiIslemleri = new JButton("URETICI ISLEMLERI");
		btn_UreticiIslemleri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_UreticiIslemleri.setBounds(86, 125, 252, 68);
		panel_3.add(btn_UreticiIslemleri);
		
		JButton btn_SatinAlimIslemiEkle = new JButton("SATIN ALIM ISLEMI EKLE");
		btn_SatinAlimIslemiEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_SatinAlimIslemiEkle.setBounds(86, 254, 252, 68);
		panel_3.add(btn_SatinAlimIslemiEkle);
		
		JButton btn_UyeSil = new JButton("UYE SIL");
		btn_UyeSil.setBackground(Color.RED);
		btn_UyeSil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_UyeSil.setBounds(364, 388, 118, 68);
		panel_3.add(btn_UyeSil);
		
		txt_Tckn_UyeSil = new JTextField();
		txt_Tckn_UyeSil.setText("TCKN");
		txt_Tckn_UyeSil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Tckn_UyeSil.setBounds(86, 388, 252, 68);
		panel_3.add(txt_Tckn_UyeSil);
		txt_Tckn_UyeSil.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_22390920524400");
		panel_4.setLayout(null);
		
		JButton btn_YeniUretimEkle = new JButton("YENI URETIM EKLE");
		btn_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_YeniUretimEkle.setBounds(158, 79, 233, 89);
		panel_4.add(btn_YeniUretimEkle);
		
		JButton btn_BirimFiyatGuncelle = new JButton("BIRIM FIYAT GUNCELLE");
		btn_BirimFiyatGuncelle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_BirimFiyatGuncelle.setBounds(581, 79, 236, 89);
		panel_4.add(btn_BirimFiyatGuncelle);
		
		JButton btn_UretimMiktariArtir = new JButton("URETIM MIKTARI ARTIR");
		btn_UretimMiktariArtir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_UretimMiktariArtir.setBounds(158, 263, 233, 89);
		panel_4.add(btn_UretimMiktariArtir);
		
		JButton btn_YeniUrunTipiEkle = new JButton("YENI URUN TIPI EKLE");
		btn_YeniUrunTipiEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_YeniUrunTipiEkle.setBounds(581, 263, 236, 89);
		panel_4.add(btn_YeniUrunTipiEkle);
		
		JPanel panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_22645865061100");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("BIRIM FIYAT GUNCELLE");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_3.setBounds(246, 21, 569, 65);
		panel_5.add(lblNewLabel_3);
		
		txt_Tckn_BirimFiyatGuncelle = new JTextField();
		txt_Tckn_BirimFiyatGuncelle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Tckn_BirimFiyatGuncelle.setText("TCKN");
		txt_Tckn_BirimFiyatGuncelle.setBounds(59, 154, 390, 40);
		panel_5.add(txt_Tckn_BirimFiyatGuncelle);
		txt_Tckn_BirimFiyatGuncelle.setColumns(10);
		
		txt_UrunId_BirimFiyatGuncelle = new JTextField();
		txt_UrunId_BirimFiyatGuncelle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunId_BirimFiyatGuncelle.setText("URUN ID");
		txt_UrunId_BirimFiyatGuncelle.setColumns(10);
		txt_UrunId_BirimFiyatGuncelle.setBounds(59, 248, 390, 40);
		panel_5.add(txt_UrunId_BirimFiyatGuncelle);
		
		txt_BirimFiyat_BirimFiyatGuncelle = new JTextField();
		txt_BirimFiyat_BirimFiyatGuncelle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_BirimFiyat_BirimFiyatGuncelle.setText("BIRIM FIYAT");
		txt_BirimFiyat_BirimFiyatGuncelle.setColumns(10);
		txt_BirimFiyat_BirimFiyatGuncelle.setBounds(59, 342, 390, 40);
		panel_5.add(txt_BirimFiyat_BirimFiyatGuncelle);
		
		JButton btn_Guncelle_BirimFiyatGuncelle = new JButton("GUNCELLE");
		btn_Guncelle_BirimFiyatGuncelle.setBounds(607, 211, 229, 65);
		panel_5.add(btn_Guncelle_BirimFiyatGuncelle);
		
		JPanel panel_6 = new JPanel();
		layeredPane.add(panel_6, "name_23027200984300");
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("URUN MIKTARI ARTIR");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_4.setBounds(246, 21, 615, 40);
		panel_6.add(lblNewLabel_4);
		
		txt_Tckn_UrunMiktariArtir = new JTextField();
		txt_Tckn_UrunMiktariArtir.setText("TCKN");
		txt_Tckn_UrunMiktariArtir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Tckn_UrunMiktariArtir.setBounds(66, 143, 387, 40);
		panel_6.add(txt_Tckn_UrunMiktariArtir);
		txt_Tckn_UrunMiktariArtir.setColumns(10);
		
		txt_UrunIsmi_UrunMiktariArtir = new JTextField();
		txt_UrunIsmi_UrunMiktariArtir.setText("URUN ISMI");
		txt_UrunIsmi_UrunMiktariArtir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunIsmi_UrunMiktariArtir.setColumns(10);
		txt_UrunIsmi_UrunMiktariArtir.setBounds(66, 227, 387, 40);
		panel_6.add(txt_UrunIsmi_UrunMiktariArtir);
		
		txt_Miktar_UrunMiktariArtir = new JTextField();
		txt_Miktar_UrunMiktariArtir.setText("MIKTAR");
		txt_Miktar_UrunMiktariArtir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Miktar_UrunMiktariArtir.setColumns(10);
		txt_Miktar_UrunMiktariArtir.setBounds(66, 316, 387, 40);
		panel_6.add(txt_Miktar_UrunMiktariArtir);
		
		JButton btn_MiktarEkle_UrunMiktariArtir = new JButton("MIKTAR EKLE");
		btn_MiktarEkle_UrunMiktariArtir.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn_MiktarEkle_UrunMiktariArtir.setBounds(66, 405, 225, 75);
		panel_6.add(btn_MiktarEkle_UrunMiktariArtir);
		
		JPanel panel_7 = new JPanel();
		layeredPane.add(panel_7, "name_23445142800400");
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("YENI URUN TIPI EKLE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(292, 29, 540, 57);
		panel_7.add(lblNewLabel_5);
		
		txt_UrunTipi_YeniUrunTipiEkle = new JTextField();
		txt_UrunTipi_YeniUrunTipiEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunTipi_YeniUrunTipiEkle.setText("URUN TIPINI GIRIN");
		txt_UrunTipi_YeniUrunTipiEkle.setBounds(123, 211, 370, 51);
		panel_7.add(txt_UrunTipi_YeniUrunTipiEkle);
		txt_UrunTipi_YeniUrunTipiEkle.setColumns(10);
		
		JButton btn_UrunTipiEkle_YeniUrunTipiEkle = new JButton("URUN TIPI EKLE");
		btn_UrunTipiEkle_YeniUrunTipiEkle.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn_UrunTipiEkle_YeniUrunTipiEkle.setBounds(622, 174, 228, 118);
		panel_7.add(btn_UrunTipiEkle_YeniUrunTipiEkle);
		
		JPanel panel_8 = new JPanel();
		layeredPane.add(panel_8, "name_23823595753400");
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("YENI URETIM EKLE");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_6.setBounds(312, 10, 489, 52);
		panel_8.add(lblNewLabel_6);
		
		txt_UreticiTckn_YeniUretimEkle = new JTextField();
		txt_UreticiTckn_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UreticiTckn_YeniUretimEkle.setText("URETICI TCKN");
		txt_UreticiTckn_YeniUretimEkle.setBounds(41, 99, 407, 40);
		panel_8.add(txt_UreticiTckn_YeniUretimEkle);
		txt_UreticiTckn_YeniUretimEkle.setColumns(10);
		
		txt_UrunId_YeniUretimEkle = new JTextField();
		txt_UrunId_YeniUretimEkle.setText("URUN ID");
		txt_UrunId_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunId_YeniUretimEkle.setColumns(10);
		txt_UrunId_YeniUretimEkle.setBounds(41, 175, 407, 40);
		panel_8.add(txt_UrunId_YeniUretimEkle);
		
		txt_Miktar_YeniUretimEkle = new JTextField();
		txt_Miktar_YeniUretimEkle.setText("MIKTAR");
		txt_Miktar_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Miktar_YeniUretimEkle.setColumns(10);
		txt_Miktar_YeniUretimEkle.setBounds(41, 253, 407, 40);
		panel_8.add(txt_Miktar_YeniUretimEkle);
		
		txt_BirimFiyat_YeniUretimEkle = new JTextField();
		txt_BirimFiyat_YeniUretimEkle.setText("BIRIM FIYAT");
		txt_BirimFiyat_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_BirimFiyat_YeniUretimEkle.setColumns(10);
		txt_BirimFiyat_YeniUretimEkle.setBounds(41, 328, 407, 40);
		panel_8.add(txt_BirimFiyat_YeniUretimEkle);
		
		/*txt_Tarih_YeniUretimEkle = new JTextField();
		txt_Tarih_YeniUretimEkle.setText("TARIH");
		txt_Tarih_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Tarih_YeniUretimEkle.setColumns(10);
		txt_Tarih_YeniUretimEkle.setBounds(41, 396, 407, 40);
		panel_8.add(txt_Tarih_YeniUretimEkle);*/
		
		JButton btn_UretimEkle_YeniUretimEkle = new JButton("URETIM EKLE");
		btn_UretimEkle_YeniUretimEkle.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn_UretimEkle_YeniUretimEkle.setBounds(625, 245, 233, 70);
		panel_8.add(btn_UretimEkle_YeniUretimEkle);
		
		JPanel panel_9 = new JPanel();
		layeredPane.add(panel_9, "name_24596290387700");
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("SATIN ALIM ISLEMI");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_7.setBounds(211, 30, 703, 43);
		panel_9.add(lblNewLabel_7);
		
		txt_UreticiTckn_SatinAlimIslemi = new JTextField();
		txt_UreticiTckn_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UreticiTckn_SatinAlimIslemi.setText("URETICI TCKN");
		txt_UreticiTckn_SatinAlimIslemi.setBounds(56, 110, 499, 43);
		panel_9.add(txt_UreticiTckn_SatinAlimIslemi);
		txt_UreticiTckn_SatinAlimIslemi.setColumns(10);
		
		txt_MusteriTckn_SatinAlimIslemi = new JTextField();
		txt_MusteriTckn_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_MusteriTckn_SatinAlimIslemi.setText("MUSTERI TCKN");
		txt_MusteriTckn_SatinAlimIslemi.setColumns(10);
		txt_MusteriTckn_SatinAlimIslemi.setBounds(56, 180, 499, 43);
		panel_9.add(txt_MusteriTckn_SatinAlimIslemi);
		
		txt_UrunId_SatinAlimIslemi = new JTextField();
		txt_UrunId_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunId_SatinAlimIslemi.setText("URUN ID");
		txt_UrunId_SatinAlimIslemi.setColumns(10);
		txt_UrunId_SatinAlimIslemi.setBounds(56, 247, 499, 43);
		panel_9.add(txt_UrunId_SatinAlimIslemi);
		
		txt_BirimFiyat_SatinAlimIslemi = new JTextField();
		txt_BirimFiyat_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_BirimFiyat_SatinAlimIslemi.setText("BIRIM FIYAT");
		txt_BirimFiyat_SatinAlimIslemi.setColumns(10);
		txt_BirimFiyat_SatinAlimIslemi.setBounds(56, 324, 499, 43);
		panel_9.add(txt_BirimFiyat_SatinAlimIslemi);
		
		txt_Miktar_SatinAlimIslemi = new JTextField();
		txt_Miktar_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Miktar_SatinAlimIslemi.setText("MIKTAR");
		txt_Miktar_SatinAlimIslemi.setColumns(10);
		txt_Miktar_SatinAlimIslemi.setBounds(56, 392, 499, 43);
		panel_9.add(txt_Miktar_SatinAlimIslemi);
		
		txt_SatisTarihi_SatinAlimIslemi = new JTextField();
		txt_SatisTarihi_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_SatisTarihi_SatinAlimIslemi.setText("SATIS TARIHI");
		txt_SatisTarihi_SatinAlimIslemi.setColumns(10);
		txt_SatisTarihi_SatinAlimIslemi.setBounds(56, 456, 499, 43);
		panel_9.add(txt_SatisTarihi_SatinAlimIslemi);
		
		JButton btn_SatinAl_SatinAlimIslemi = new JButton("SATIN AL");
		btn_SatinAl_SatinAlimIslemi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_SatinAl_SatinAlimIslemi.setBounds(714, 247, 269, 79);
		panel_9.add(btn_SatinAl_SatinAlimIslemi);
		
		JPanel panel_10 = new JPanel();
		layeredPane.add(panel_10, "name_25444968910900");
		panel_10.setLayout(null);
		
		JButton btn_11 = new JButton("URUNU SATAN KULLANICILARI, MIKTAR ve BIRIM FIYATLARINI LISTELE");
		btn_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_11.setBounds(97, 55, 915, 64);
		panel_10.add(btn_11);
		
		JLabel lblNewLabel_8 = new JLabel("SORGULAR");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_8.setBounds(301, 10, 487, 35);
		panel_10.add(lblNewLabel_8);
		
		JButton btn_13 = new JButton("BELIRLI MIKTAR UZERINDE BULUNAN URUNLERI LISTELE");
		btn_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_13.setBounds(97, 129, 915, 64);
		panel_10.add(btn_13);
		
		JButton btn_17 = new JButton("SATIS LOGLARINI LISTELE");
		btn_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_17.setBounds(97, 203, 439, 64);
		panel_10.add(btn_17);
		
		JButton btn_14 = new JButton("URUNUN ORTALAMA SATIS FIYATI");
		btn_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_14.setBounds(562, 203, 450, 64);
		panel_10.add(btn_14);
		
		JButton btn_12 = new JButton("KULLANICININ TOPLAM KAZANCI");
		btn_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_12.setBounds(97, 287, 439, 64);
		panel_10.add(btn_12);
		
		JButton btn_15 = new JButton("URETICININ SON X GUNDEKI SATIS LOGLARI");
		btn_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_15.setBounds(562, 287, 450, 64);
		panel_10.add(btn_15);
		
		JButton btn_16 = new JButton("HANGI URUNI KAC FARKLI URETICI URETMIS LISTELE");
		btn_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_16.setBounds(97, 375, 915, 64);
		panel_10.add(btn_16);
		
		JButton btn_18 = new JButton("BELIRLI URUNU ONCEDEN SATMIS VE SU ANDA SATAN KULLANICILARI LISTELE");
		btn_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_18.setBounds(97, 449, 915, 64);
		panel_10.add(btn_18);
		
		JPanel panel_11 = new JPanel();
		layeredPane.add(panel_11, "name_26481908585800");
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("URUN URETICI BILGILERI");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_9.setBounds(307, 31, 503, 49);
		panel_11.add(lblNewLabel_9);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(34, 210, 1000, 264);
		panel_11.add(scrollPane_11);
		
		table_11 = new JTable();
		scrollPane_11.setViewportView(table_11);
		
		txt_UrunAdi_11 = new JTextField();
		txt_UrunAdi_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunAdi_11.setText("URUN ADI");
		txt_UrunAdi_11.setBounds(115, 115, 303, 49);
		panel_11.add(txt_UrunAdi_11);
		txt_UrunAdi_11.setColumns(10);
		
		JButton btn_listele_11 = new JButton("LISTELE");
		btn_listele_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_listele_11.setBounds(496, 115, 116, 49);
		panel_11.add(btn_listele_11);
		
		JPanel panel_12 = new JPanel();
		layeredPane.add(panel_12, "name_27325668946800");
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("KULLANICININ TOPLAM KAZANCI");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_10.setBounds(223, 22, 609, 56);
		panel_12.add(lblNewLabel_10);
		
		txt_UreticiTckn_12 = new JTextField();
		txt_UreticiTckn_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UreticiTckn_12.setText("URETICI TCKN");
		txt_UreticiTckn_12.setBounds(120, 102, 392, 46);
		panel_12.add(txt_UreticiTckn_12);
		txt_UreticiTckn_12.setColumns(10);
		
		JButton btn_Sorgula_12 = new JButton("SORGULA");
		btn_Sorgula_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Sorgula_12.setBounds(627, 102, 168, 46);
		panel_12.add(btn_Sorgula_12);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(10, 177, 1034, 308);
		panel_12.add(scrollPane_12);
		
		table_12 = new JTable();
		scrollPane_12.setViewportView(table_12);
		
		JPanel panel_13 = new JPanel();
		layeredPane.add(panel_13, "name_27703065231400");
		panel_13.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("BELIRLI MIKTAR UZERINDE BULUNAN URUNLERI L\u0130STELE");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_11.setBounds(116, 27, 845, 56);
		panel_13.add(lblNewLabel_11);
		
		txt_Miktar_13 = new JTextField();
		txt_Miktar_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_Miktar_13.setText("MIKTAR");
		txt_Miktar_13.setBounds(95, 117, 361, 44);
		panel_13.add(txt_Miktar_13);
		txt_Miktar_13.setColumns(10);
		
		JButton btn_Sorgu_13 = new JButton("SORGU");
		btn_Sorgu_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Sorgu_13.setBounds(512, 117, 136, 44);
		panel_13.add(btn_Sorgu_13);
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(32, 185, 996, 310);
		panel_13.add(scrollPane_13);
		
		table_13 = new JTable();
		scrollPane_13.setViewportView(table_13);
		
		JPanel panel_14 = new JPanel();
		layeredPane.add(panel_14, "name_27925970120500");
		panel_14.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("URUNUN ORTALAMA SATIS FIYATI");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_12.setBounds(287, 25, 571, 57);
		panel_14.add(lblNewLabel_12);
		
		txt_UrunAdi_14 = new JTextField();
		txt_UrunAdi_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunAdi_14.setText("URUN ADI");
		txt_UrunAdi_14.setBounds(96, 160, 410, 57);
		panel_14.add(txt_UrunAdi_14);
		txt_UrunAdi_14.setColumns(10);
		
		JButton btn_Bul_14 = new JButton("BUL");
		btn_Bul_14.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn_Bul_14.setBounds(642, 160, 155, 57);
		panel_14.add(btn_Bul_14);
		
		JLabel lbl_Sonuc_14 = new JLabel("SONUC");
		lbl_Sonuc_14.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lbl_Sonuc_14.setBounds(361, 308, 243, 57);
		panel_14.add(lbl_Sonuc_14);
		
		JPanel panel_15 = new JPanel();
		layeredPane.add(panel_15, "name_28208817884100");
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("BIR URUNUN BELIRLI GUNDEKI SATIS LOGLARI");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(118, 29, 798, 51);
		panel_15.add(lblNewLabel_13);
		
		txtGunSays = new JTextField();
		txtGunSays.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtGunSays.setText("GUN SAYISI");
		txtGunSays.setBounds(39, 117, 331, 51);
		panel_15.add(txtGunSays);
		txtGunSays.setColumns(10);
		
		txtTur = new JTextField();
		txtTur.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTur.setText("TUR");
		txtTur.setColumns(10);
		txtTur.setBounds(418, 117, 331, 51);
		panel_15.add(txtTur);
		
		JButton btnNewButton = new JButton("SORGULA");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(831, 117, 143, 51);
		panel_15.add(btnNewButton);
		
		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(39, 217, 1004, 283);
		panel_15.add(scrollPane_15);
		
		table_15 = new JTable();
		scrollPane_15.setViewportView(table_15);
		
		JPanel panel_16 = new JPanel();
		layeredPane.add(panel_16, "name_28412598422600");
		panel_16.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("HANGI URUNU KAC FARKLI URETICI URETMIS");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_14.setBounds(138, 22, 796, 37);
		panel_16.add(lblNewLabel_14);
		
		JScrollPane scrollPane_16 = new JScrollPane();
		scrollPane_16.setBounds(138, 101, 796, 400);
		panel_16.add(scrollPane_16);
		
		table_16 = new JTable();
		scrollPane_16.setViewportView(table_16);
		
		JPanel panel_17 = new JPanel();
		layeredPane.add(panel_17, "name_28559017312200");
		panel_17.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("SATIS LOGLARINI LISTELE");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_15.setBounds(217, 24, 685, 58);
		panel_17.add(lblNewLabel_15);
		
		JScrollPane scrollPane_17 = new JScrollPane();
		scrollPane_17.setBounds(34, 111, 1004, 362);
		panel_17.add(scrollPane_17);
		
		table_17 = new JTable();
		scrollPane_17.setViewportView(table_17);
		
		JPanel panel_18 = new JPanel();
		layeredPane.add(panel_18, "name_28817997008200");
		panel_18.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("BELIRLI URUNU ONCEDEN SATMIS VE SU ANDA SATAN KULLANICILARI LISTELE");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_16.setBounds(10, 21, 1046, 48);
		panel_18.add(lblNewLabel_16);
		
		txt_UrunAdi_18 = new JTextField();
		txt_UrunAdi_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_UrunAdi_18.setText("URUN ADI");
		txt_UrunAdi_18.setBounds(57, 108, 289, 48);
		panel_18.add(txt_UrunAdi_18);
		txt_UrunAdi_18.setColumns(10);
		

		
		
		
		JButton btn_Sorgula_18 = new JButton("SORGULA");
		btn_Sorgula_18.setBounds(463, 108, 144, 48);
		panel_18.add(btn_Sorgula_18);
		
		JScrollPane scrollPane_18 = new JScrollPane();
		scrollPane_18.setBounds(57, 188, 967, 296);
		panel_18.add(scrollPane_18);
		
		table18 = new JTable();
		scrollPane_18.setViewportView(table18);
		
		
		
		/***
		 * BUTTONS
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		btn_Anasayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		/*btn_UyeKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				try {
					ResultSet r = Sorgular.listele();
					while (r.next ()) {
						String dname = r.getString(1);
						Integer dnumber = r.getInt(2);
						String mgrssn = r.getString(3);
						String mgrstartdate = r.getString(4);
						System.out.println(dname + " "+dnumber+ " " +mgrssn+ " "+mgrstartdate  );
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}	
			}
		});*/
		
		
		btn_UyeKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_UyeIslemleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		btn_Sorgular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_10);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		btn_UreticiIslemleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		btn_SatinAlimIslemiEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_9);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		btn_YeniUretimEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_8);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		
		btn_BirimFiyatGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		
		
		btn_UretimMiktariArtir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_6);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		
		
		btn_YeniUrunTipiEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_7);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		
		
		/**
		 * 
		 * 
		 * 
		 * @@@@ BUTTONS WITH FUNCTIONS
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		btn_MusteriKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1,s2,s3,s4,s5,s6;
				s1 = txt_Isim_UyeKayit.getText();
				s2 = txt_Soyisim_UyeKayit.getText();
				s3 = txt_Tckn_UyeKayit.getText();
				s4 = txt_Telefon_UyeKayit.getText();
				s5 = txt_Il_UyeKayit.getText();
				s6 = txt_Ilce_UyeKayit.getText();
				try {
					Sorgular.musteriKayit(s1,s2,s3,s4,s5,s6);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}	
			}
		});
		
		btn_UreticiKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2,s3,s4,s5,s6;
				s1 = txt_Isim_UyeKayit.getText();
				s2 = txt_Soyisim_UyeKayit.getText();
				s3 = txt_Tckn_UyeKayit.getText();
				s4 = txt_Telefon_UyeKayit.getText();
				s5 = txt_Il_UyeKayit.getText();
				s6 = txt_Ilce_UyeKayit.getText();
				try {
					Sorgular.ureticiKayit(s1,s2,s3,s4,s5,s6);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btn_UyeSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1;
				s1 = txt_Tckn_UyeSil.getText();
				try {
					Sorgular.uyeSil(s1);
				} catch (SQLException e1) {
					System.out.println("Islem basarisiz");
					e1.printStackTrace();
				}
			}
		});
		

		btn_Guncelle_BirimFiyatGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2,s3;
				s1= txt_Tckn_BirimFiyatGuncelle.getText();
				s2= txt_UrunId_BirimFiyatGuncelle.getText();
				s3= txt_BirimFiyat_BirimFiyatGuncelle.getText();
				try {
					Sorgular.birimFiyatGuncelle(s1, Integer.parseInt(s2), new BigDecimal(s3));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btn_MiktarEkle_UrunMiktariArtir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2,s3;
				s1= txt_Tckn_UrunMiktariArtir.getText();
				s2= txt_UrunIsmi_UrunMiktariArtir.getText();
				s3= txt_Miktar_UrunMiktariArtir.getText();
				try {
					Sorgular.urunMiktariArtir(s1, s2, Integer.parseInt(s3));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btn_UrunTipiEkle_YeniUrunTipiEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1;
				s1= txt_UrunTipi_YeniUrunTipiEkle.getText();
				try {
					Sorgular.yeniUrunTipiEkle(s1);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btn_UretimEkle_YeniUretimEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2,s3,s4;
				s1= txt_UreticiTckn_YeniUretimEkle.getText();
				s2= txt_UrunId_YeniUretimEkle.getText();
				s3= txt_Miktar_YeniUretimEkle.getText();
				s4= txt_BirimFiyat_YeniUretimEkle.getText();
				try {
					Sorgular.yeniUretimEkle(s1,Integer.parseInt(s2),new BigDecimal(s3),new BigDecimal(s4));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btn_SatinAl_SatinAlimIslemi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1,s2,s3,s4,s5,s6;
				s1= txt_UreticiTckn_SatinAlimIslemi.getText();
				s2= txt_MusteriTckn_SatinAlimIslemi.getText();
				s3= txt_UrunId_SatinAlimIslemi.getText();
				s4= txt_BirimFiyat_SatinAlimIslemi.getText();
				s5 =txt_Miktar_SatinAlimIslemi.getText();
				s6 =txt_SatisTarihi_SatinAlimIslemi.getText();
				
				Date date=Date.valueOf(s6);
				try {
					Sorgular.satinAl(s1, s2, Integer.parseInt(s3), new BigDecimal(s4), new BigDecimal(s5), date);
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		/**
		 * 
		 * 
		 * SORGULAR *******
		 * 
		 * 
		 * 
		 * 
		 * */
		
		DefaultTableModel model17 = new DefaultTableModel();
		Object[] columns17 = {"satisId","uyeTckn","musteriTckn","urunId","birimFiyat","miktar","tarih","Toplam Fiyat"};
		Object[] rows17 = new Object[8];
		
		btn_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_17);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model17.setColumnCount(0);
				model17.setRowCount(0);
				model17.setColumnIdentifiers(columns17);
				
				try {
					ResultSet r = Sorgular.satisLoglariniListele();
					while (r.next ()) {
						rows17[0] =r.getInt(1);
						rows17[1] =r.getString(2);
						rows17[2] =r.getString(3);
						rows17[3] =r.getInt(4);
						rows17[4] =r.getBigDecimal(5);
						rows17[5] =r.getBigDecimal(6);
						rows17[6] =r.getDate(7);
						rows17[7] =r.getBigDecimal(8);
						model17.addRow(rows17);
						/*Integer satisId = r.getInt(1);
						String uyeTckn = r.getString(2);
						String musteriTckn = r.getString(3);
						Integer urunId = r.getInt(4);
						BigDecimal birimFiyat = r.getBigDecimal(5);
						BigDecimal miktar = r.getBigDecimal(6);
						Date date = r.getDate(7);
						BigDecimal toplamFiyat = r.getBigDecimal(8);*/
					}
					table_17.setModel(model17);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		DefaultTableModel model16 = new DefaultTableModel();
		Object[] columns16 = {"Tur","Toplam"};
		Object[] rows16 = new Object[2];
		btn_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel_16);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model16.setColumnCount(0);
				model16.setRowCount(0);
				model16.setColumnIdentifiers(columns16);
				
				try {
					ResultSet r = Sorgular.sorgu16();
					while (r.next ()) {
						rows16[0] =r.getString(1);
						rows16[1] =r.getLong(2);
						model16.addRow(rows16);
					}
					table_16.setModel(model16);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		DefaultTableModel model11 = new DefaultTableModel();
		Object[] columns11 = {"Ad","Soyad","Miktar","Birim Fiyat"};
		Object[] rows11 = new Object[4];
		btn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_11);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_listele_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel_11);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model11.setColumnCount(0);
				model11.setRowCount(0);
				model11.setColumnIdentifiers(columns11);
				
				
				try {
					String s1 = txt_UrunAdi_11.getText();
					ResultSet r = Sorgular.sorgu11(s1);
					while (r.next ()) {
						rows11[0] =r.getString(1);
						rows11[1] =r.getString(2);
						rows11[2] =r.getBigDecimal(3);
						rows11[3] =r.getBigDecimal(4);
						model11.addRow(rows11);
					}
					table_11.setModel(model11);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		

		/* -- - - - - - - - */
		
		
		
		DefaultTableModel model13 = new DefaultTableModel();
		Object[] columns13 = {"Tur","Toplam"};
		Object[] rows13 = new Object[2];
		btn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_13);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_Sorgu_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel_13);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model13.setColumnCount(0);
				model13.setRowCount(0);
				model13.setColumnIdentifiers(columns13);
				
				
				try {
					String s1 = txt_Miktar_13.getText();
					ResultSet r = Sorgular.sorgu13(new BigDecimal(s1));
					while (r.next ()) {
						rows13[0] =r.getString(1);
						rows13[1] =r.getBigDecimal(2);
						model13.addRow(rows13);
					}
					table_13.setModel(model13);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		
		DefaultTableModel model12 = new DefaultTableModel();
		Object[] columns12 = {"Toplam"};
		Object[] rows12 = new Object[1];
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_12);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_Sorgula_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel_12);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model12.setColumnCount(0);
				model12.setRowCount(0);
				model12.setColumnIdentifiers(columns12);
				
				
				try {
					String s1 = txt_UreticiTckn_12.getText();
					ResultSet r = Sorgular.sorgu12(s1);
					while (r.next ()) {
						rows12[0] =r.getBigDecimal(1);
						model12.addRow(rows12);
					}
					table_12.setModel(model12);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		
		

		btn_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_14);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_Bul_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel_14);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				
				try {
					String s1 = txt_UrunAdi_14.getText();
					ResultSet r = Sorgular.sorgu14(s1);
					while (r.next ()) {
						lbl_Sonuc_14.setText(r.getBigDecimal(1).toString());
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});	
		
		
		
		DefaultTableModel model15 = new DefaultTableModel();
		Object[] columns15 = {"Üye TC","Miktar","Urun ID","Satis Tarihi"};
		Object[] rows15 = new Object[4];
		btn_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_15);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel_15);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model15.setColumnCount(0);
				model15.setRowCount(0);
				model15.setColumnIdentifiers(columns15);
				String mynew[] = null;
				String errorInp = "Veri yok";
				try {
					String s2 = txtGunSays.getText();
					String s1 = txtTur.getText();
					ResultSet r = Sorgular.sorgu15(s1,Integer.parseInt(s2));
					//String temp = r.getString("uyeTckn");
					String out;
					while (r.next ()) {
						String tmp = r.getString(1);
						if(tmp!=null) {
							out=tmp.replaceAll("[{]","").replaceAll("\"", "").replaceAll("[(]","").replaceAll("[)]","").replaceAll("[}]","");
							mynew= out.split(",");
						}
						
						
					}
					if(mynew!=null) {
						for(int i=0;i<mynew.length/4;i++){  
							for(int j=0;j<4;j++) {
								rows15[j]=mynew[(i*4)+j]; 
							}
					        model15.addRow(rows15);
					    }
					}
					if(mynew!=null) {
						table_15.setModel(model15);
					}
					else {
						rows15[0]=errorInp;
						rows15[1]=errorInp;
						rows15[2]=errorInp;
						rows15[3]=errorInp;
						model15.addRow(rows15);
						table_15.setModel(model15);
						JOptionPane.showMessageDialog(null, "Verilen Kriterler için uygun veri yok");

					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		
		
		DefaultTableModel model18 = new DefaultTableModel();
		Object[] columns18 = {"Ad","Soyad","Tel"};
		Object[] rows18 = new Object[3];
		btn_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_18);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_Sorgula_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				layeredPane.removeAll();
				layeredPane.add(panel_18);
				layeredPane.repaint();
				layeredPane.revalidate();
				
				model18.setColumnCount(0);
				model18.setRowCount(0);
				model18.setColumnIdentifiers(columns18);
				
				
				try {
					String s1 = txt_UrunAdi_18.getText();
					ResultSet r = Sorgular.sorgu18(s1);
					while (r.next ()) {
						rows18[0] =r.getString(1);
						rows18[1] =r.getString(2);
						rows18[2] =r.getString(3);
						model18.addRow(rows18);
					}
					table18.setModel(model18);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		

	}
}
