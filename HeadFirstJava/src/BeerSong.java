
public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println("Take one, let it go in a circle.");
			beerNum = beerNum - 1;
			if (beerNum == 1) {
				word = "bottle";
			}
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
				System.out.println();
			} else {
				System.out.println("No bottles of beer on the wall.");
			}
		}
	}

}
