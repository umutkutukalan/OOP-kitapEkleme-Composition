package KayraKitap;

public class sayfa {

	private int sayfa;
	
	// CONSTRUCTORS
	public sayfa(int sayfa) {
		this.sayfa = sayfa;
	}
	
	// ENCAPSULATİON
	public void setSayfa(int sayfa) {
		this.sayfa = sayfa;
	}
	public int getSayfa() {
		return this.sayfa;
	}
	
	public void sayfaBilgisi() {
		System.out.println("Kitabınız " + sayfa + " sayfaya sahiptir.");
	}
}
