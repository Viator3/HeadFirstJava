class Puppy {
	
	String name;
	public static void main(String[] args) {
		Puppy puppy1 = new Puppy();
		puppy1.bark();
		puppy1.name = "Bart";

		Puppy[] myPuppy = new Puppy[3];
		myPuppy[0] = new Puppy();
		myPuppy[1] = new Puppy();
		myPuppy[2] = puppy1;
		
		myPuppy[0].name = "Fred";
		myPuppy[1].name = "George";
		
		System.out.println("Name of the last puppy - " + myPuppy[2].name);
		
		int x = 0;
		while (x < myPuppy.length) {
			myPuppy[x].bark();
			x++;
		}
	}
	
	public void bark() {
		System.out.println(name + " said Gav!");
	}
	
	public void eat() {
	}
	
	public void chaseCat() {
	}
}
