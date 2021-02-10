package weekThree;

import java.util.Scanner;

public class FirstHourClass {	
	Scanner input = new Scanner(System.in);
	
	public void accessTerminalMethod() {
		//Variables
		//1
		System.out.println("Enter your serial key ID: ");
		int serialNumberID = input.nextInt();
		boolean isNumberMoreThanTwoDigits = serialNumberID > 99 && serialNumberID < 100_000;
		boolean isNumberMoreThanSixDigits = serialNumberID > 999_999;
		boolean isNumberSixDigits = serialNumberID >= 100_000 && serialNumberID <= 999_999;
		//2 
		String personVip;
		boolean isPersonVip = serialNumberID % 2 == 0;
		//3
		String secondDishOption;
		boolean hasSecondDishOption = serialNumberID % 10 > 3;
		//4
		String specialVip;
		boolean isSpecialVip = hasSecondDishOption && isPersonVip;
		//5

		
		//Solutions
		//1
		String serialNumberKey = 
				isNumberMoreThanTwoDigits ? 
						(isNumberMoreThanSixDigits ? "LAGGER" : 
							(isNumberSixDigits? "NORMAL": "EARLY_ADOPTER")
						) : "ID NUMBER IS TWO DIGITS" ;
		System.out.println(serialNumberKey);
		
		
		//2
		personVip = (isPersonVip) ? "VIP":"NOT VIP" ;
		System.out.println(personVip);
		
		//3
		secondDishOption = (hasSecondDishOption) ? 
									"Order second dish" : 
											"You can't order second dish";
		System.out.println(secondDishOption);
		
		//4
		specialVip = isSpecialVip ? "Super VIP" : "Not Super VIP";
		System.out.println(specialVip);
		
		//5
		System.out.println("*** Menu ***");
		System.out.println("1. French Fries");
		System.out.println("2. Fish");
		System.out.println("3. Salad");
		System.out.println("4. Steak");
		System.out.println("5. Pizza");
		
		String[] menu = {
				"1. French Fries", "2. Fish", "3. Salad", "4. Steak", "5. Pizza"
		};	
	
		int selectMenuOption = input.nextInt();
		System.out.println("You picked: " + menu[selectMenuOption - 1]);
	}
}









