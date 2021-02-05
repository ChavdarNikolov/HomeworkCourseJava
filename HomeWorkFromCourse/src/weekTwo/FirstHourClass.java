package weekTwo;

import java.util.Scanner;

public class FirstHourClass {
	public void variables() {
		//1
		int iceCreamCountForOneDay = 10_000;
		System.out.println(iceCreamCountForOneDay);
		
		//2
		double iceCreamPriceForOne = 3.14;
		System.out.println(iceCreamPriceForOne);
		
		//3
		String iceCreamName = "Extreme Icecream";
		System.out.println(iceCreamName);
		
		//4
		boolean isProductionActive = true;
		System.out.println(isProductionActive);
		
		//5
		char iceCreamIdBegining = 'A';
		int iceCreamIdEnd = 1234;
		System.out.println(iceCreamIdBegining + iceCreamIdEnd);
		
		//6
		String[] iceCreamFlavors = {
			"Choco", "Strawbery", "Orange",	"Banana"
		};
		System.out.println(iceCreamFlavors[3]);
		
		//7
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		System.out.println(firstName + " has joined the queue");
	}
}








