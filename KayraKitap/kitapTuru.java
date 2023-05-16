package KayraKitap;

public class kitapTuru {

	private String kitapTuru;
	
	// CONSTRUCTORS
	public kitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}
	
	// ENCAPSULATİON
	public void setKitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}
	public String getKitapTuru() {
		return this.kitapTuru;
	}
	
	public void kitapTuruBilgisi() {
		System.out.println("Kitabınız " + kitapTuru + " başlığı altındadır.");
	}
}
