class Cat {
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println("May! May!");
	}
}

class CatTestDrive {

	public static void main(String[] args) {
		Cat c;         
		new Cat();     
		c = new Cat();
		c.size = 40;
		c.bark();
	}

}
