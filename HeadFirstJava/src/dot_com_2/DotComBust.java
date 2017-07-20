package dot_com_2;

import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses;
	
	private void setUpGame() {
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println("Your goal is to sink three \"sites\".");
		System.out.println("\"Pets.com\", \"eToys.com\" and \"Go2.com\"");
		System.out.println("Try to sink them for fewer moves");
		
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGues = helper.getUserInput("Make a move");
			checkUserGuess(userGues);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "Mimo";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("Popal")) {
				break;
			}
			if (result.equals("Potopil")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame() {
		System.out.println("All the \"sites\" have gone to the bottom!");
		if (numOfGuesses <= 18) {
			System.out.println("It took you only " + numOfGuesses + " attempts");
		} else {
			System.out.println("It took you quite a few tries - " + numOfGuesses);
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
