class GoodDog {
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int aSize) {
		size = aSize;
	}
	
	void bark() {
		if (size > 60) {
			System.out.println("Gav! Gav!");
		} else {
			if (size > 14) {
				System.out.println("Vuf! Vuf!");
			} else {
				System.out.println("Tyaf! Tyaf!");
			}
		}
	}
}

class GoodDogTestDrive {

	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("First dog: " + one.getSize());
		System.out.println("Second dog: " + two.getSize());
		one.bark();
		two.bark();
	}

}
