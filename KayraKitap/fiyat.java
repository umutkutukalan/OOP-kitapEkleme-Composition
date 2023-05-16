package KayraKitap;

public class fiyat {
	private double fiyat;
	
	// CONSTRUCTORS
	public fiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	// ENCAPSULATİON
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getFiyat() {
		return this.fiyat;
	}
	
	public void fiyatBilgisi() {
		System.out.println("Kitabınızın fiyatını " + fiyat + " TL olarak belirlediniz.");
	}
}
