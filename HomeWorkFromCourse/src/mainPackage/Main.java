package mainPackage;

import weekOne.FirstHour;
import weekOne.SecondHourClass;

public class Main {

	public static void main(String[] args) {
		FirstHour display = new FirstHour();
		display.printMessage();
		
		System.out.println();
		
		SecondHourClass iceCreamDisplayInfo = new SecondHourClass();
		iceCreamDisplayInfo.variables();
	}

}
