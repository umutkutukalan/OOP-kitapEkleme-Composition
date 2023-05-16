package KayraKitap;

public class kitapEkle {

	
	
	public static void main(String[] args) {

		sayfa sayfa1 = new sayfa(110);
		kitapTuru kitapTuru1 = new kitapTuru("Dünya Klasikleri");
		fiyat fiyat1 = new fiyat(60);
		kitap kitabım1 = new kitap("Fareler ve İnsanlar", sayfa1, kitapTuru1, fiyat1);
		
		kitabım1.getSayfa().sayfaBilgisi();
		kitabım1.getKitapTuru().kitapTuruBilgisi();
		kitabım1.getFiyat().fiyatBilgisi();
		kitabım1.kitabımıEkle();
		
		System.out.println("-------------------");
		
		sayfa sayfa2 = new sayfa(362);
		kitapTuru kitapTuru2 = new kitapTuru("Tarihi Roman");
		fiyat fiyat2 = new fiyat(52);
		kitap kitabım2 = new kitap("Savaşçıların Efendisi Alparslan", sayfa2, kitapTuru2, fiyat2);
		
		kitabım2.getSayfa().sayfaBilgisi();
		kitabım2.getKitapTuru().kitapTuruBilgisi();
		kitabım2.getFiyat().fiyatBilgisi();
		kitabım2.kitabımıEkle();
		
		

	}

}
