package weekTwo;

import java.util.Scanner;

public class SecondHourClass {
	public void operators() {
		//1
		System.out.print("Give a name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		System.out.println("Hello " + firstName);
		
		//2
		System.out.print("Enter how many ice creams are created for a day: ");
		int iceCreamCountForADay = input.nextInt();
		System.out.println("IceCream created for a day: " + iceCreamCountForADay);
		
		//3
		System.out.print("Number of ice cream for one convenience store(out of ten): ");
		int countOfConvenienceStore = 10;
		System.out.println(iceCreamCountForADay / countOfConvenienceStore);
		
		//4
		int yesterdayIceCreamCount = 20_000;
		String message = (iceCreamCountForADay > yesterdayIceCreamCount) 
						? "Good Job" 
						: "Low Capacity";
		System.out.println(message);
		
		//5
		int numberOfIceCreamMinPerDay = 1_000;
		System.out.println("Number of ice cream minimum per day: " + numberOfIceCreamMinPerDay);
		numberOfIceCreamMinPerDay += iceCreamCountForADay;
		System.out.println("Number of ice cream with user created ice cream " + 
							numberOfIceCreamMinPerDay);
		
		input.close();
	}
}




