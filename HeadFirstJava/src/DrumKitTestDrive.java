class DrumKit {
	
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("Bah bah ba-bah");
	}
	
	void playTopHat() {
		System.out.println("Dinh dinh di-dinh");
	}
}

public class DrumKitTestDrive {

	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();
	}

}
