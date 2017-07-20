abstract class Animal{
	
}

class Wolf extends Animal {
	
}

class Lion extends Animal {
	
}
class MyAnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal a) {
		if (nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal added to cell " + nextIndex);
			System.out.println(a.getClass());
			nextIndex++;
		}
	}
}
public class AnimalTestDrive {

	public static void main(String[] args) {
		MyAnimalList list = new MyAnimalList();
		Wolf w = new Wolf();
		Lion l = new Lion();
		list.add(w);
		list.add(l);
	}

}
