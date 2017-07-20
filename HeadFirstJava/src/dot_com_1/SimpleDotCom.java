package dot_com_1;

import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<Integer> locationCells;
	
	public void setLocationCells(ArrayList<Integer> locations) {
		locationCells = locations;
	}
	
	public String checkYourself(String userInput) {
		int userInputInt = Integer.parseInt(userInput);
		String result = "Mimo";
		int index = locationCells.indexOf(userInputInt);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "Potopil";
			} else {
				result = "Popal";
			}
		}
		System.out.println(result);
		return result;
		
	}
}
