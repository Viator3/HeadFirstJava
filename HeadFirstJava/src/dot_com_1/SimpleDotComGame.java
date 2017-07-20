package dot_com_1;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotComGame {

	public static void main(String[] args) {
		int numOfGues = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNum = (int) (Math.random() * 5);
		ArrayList<Integer> locations = new ArrayList<Integer>(Arrays.asList(randomNum, randomNum + 1, randomNum + 2));
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive == true) {
			String guess = helper.setUserInput("Enter the number: ");
			String result = theDotCom.checkYourself(guess);
			numOfGues++;
			if (result.equals("Potopil")) {
				isAlive = false;
				System.out.println("You took " + numOfGues + " attempts");
			}
		}
	}

}
