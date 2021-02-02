package weekOne;

import java.util.Scanner;

public class SecondHourClass {
	public void variables() {
		int iceCreamCountForOneDay = 10_000;
		System.out.println(iceCreamCountForOneDay);
		
		double iceCreamPriceForOne = 3.14;
		System.out.println(iceCreamPriceForOne);
		
		String iceCreamName = "Extreme Icecream";
		System.out.println(iceCreamName);
		
		boolean isProductionActive = true;
		System.out.println(isProductionActive);
		
		char iceCreamIdBegining = 'A';
		int iceCreamIdEnd = 1234;
		System.out.println(iceCreamIdBegining + iceCreamIdEnd);
		
		String[] iceCreamFlavors = {
			"Choco", "Strawbery", "Orange",	"Banana"
		};
		System.out.println(iceCreamFlavors[3]);
		
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		System.out.println(firstName + " has joined the queue");
	}
}








