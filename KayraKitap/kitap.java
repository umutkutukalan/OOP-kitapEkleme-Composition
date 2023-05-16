package KayraKitap;

public class kitap {
	
	private String kitapAdi;
	// COMPOSİTON
	private sayfa sayfa;
	private kitapTuru kitapTuru;
	private fiyat fiyat;
	
	
	// CONSTRUCTORS
	public kitap(String kitapAdi, sayfa sayfa, kitapTuru kitapTuru, fiyat fiyat) {
		this.kitapAdi = kitapAdi;
		this.sayfa = sayfa;
		this.kitapTuru = kitapTuru;
		this.fiyat = fiyat;
	}
	
	
	// ENCAPSULATİON
	// kitap adı
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getKitapAdi() {
		return this.kitapAdi;
	}
	
	// sayfa
	public void setSayfa(sayfa sayfa) {
		this.sayfa = sayfa;
	}
	public sayfa getSayfa() {
		return this.sayfa;
	}
	
	// kitap türü
	public void setKitapTuru(kitapTuru kitapTuru) {
		this.kitapTuru = kitapTuru;
	}
	public kitapTuru getKitapTuru() {
		return this.kitapTuru;
	}
	
	// fiyat
	public void setFiyat(fiyat fiyat) {
		this.fiyat = fiyat;
	}
	public fiyat getFiyat() {
		return this.fiyat;
	}
	
	public void kitabımıEkle() {
		System.out.println("Kitabınız sisteme eklenmiştir.");
	}
	
}
