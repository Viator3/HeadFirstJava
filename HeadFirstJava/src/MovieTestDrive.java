
class Movie {
	String title;
	String genre;
	int rating;
		
	void playIt() {
		System.out.println("Playing a movie");
	}
}

public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "How to burn in stocks";
		one.genre = "Tragedy";
		one.rating = -2;
		
		Movie two = new Movie();
		two.title = "Lost in the office";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragedy, but generally cheerful";
		three.rating = 127;
	}

}
