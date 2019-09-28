package fortuneTeller;

import java.text.NumberFormat;  //currency converter
import java.util.Scanner;

public class FortuneTeller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declarations:
		String favoriteColor;
		String vacationHomeLocation ;
		String transportation ; 		//mode of transportation after retirement. 
		String firstName = "";
		String lastName = "";
		String userAnswer = "";  //This will temporary hold strings for integer values. 
		Integer age = 0;
		Integer birthMonth = 0;
		Integer siblings = 0;
		Integer yearsToRetire = 0;
		Double balanceInBank = 00.00;
		

		
		 
		Scanner input = new Scanner(System.in);		//will accept string input from user
		Scanner inputInt = new Scanner(System.in);	//will accept Integer input from user
	
	//prompt user to enter values:
		System.out.println("Please enter your first name");
		firstName = input.nextLine();
		
		//check if user enters quit
		if (firstName.toLowerCase().equals("quit"))
		{	System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		
				
		System.out.println("Please enter your last name");
		lastName = input.nextLine();
		
		//check if user enters quit
		if (lastName.toLowerCase().equals("quit"))
		{	System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		
		
		System.out.println("Please enter the digit of the month you were born");
		userAnswer = input.nextLine();
		
		//test for quit
		if (userAnswer.toLowerCase().equals("quit"))
		{	System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		//convert userAnswer to an integer and assign it to birthMonth
		birthMonth = Integer.parseInt(userAnswer); 

		
				
		System.out.println("Please enter your age");
		userAnswer = input.nextLine();
		//test for quit
		if (userAnswer.toLowerCase().equals("quit"))
		{	System.out.println("Nobody likes a quitter");
			System.exit(0);
		}		
		age = Integer.parseInt(userAnswer);
		
		
		
		//prompt user for their favorite color
		System.out.println("Please enter your favorite ROYGBIV color. If you don't know what "
				+ "ROYGBIV stands for, please enter Help");
		favoriteColor = input.nextLine();
		//check if user enters quit
				if (favoriteColor.toLowerCase().equals("quit"))
				{	System.out.println("Nobody likes a quitter");
					System.exit(0);
				}
		
				
			while(favoriteColor.toLowerCase().equals("help"))
			{	System.out.println("ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo and Violet");
				System.out.println("Please enter your favorite ROYGBIV color");
				favoriteColor = input.nextLine();
				
			//check if user enters quit
			if (favoriteColor.toLowerCase().equals("quit"))
			{	System.out.println("Nobody likes a quitter");
				System.exit(0);
			} //end if				
			}//end while
				

	
			
		//determine transportation method based on favorite color entered.
		switch (favoriteColor.toLowerCase()) { 
		case "red": 
			transportation = "bike";
			break;
		case "orange": 
			transportation = "Royce";
			break;
		case "yellow": 
			transportation = "BMW";
			break;
		case "green": 
			transportation = "Motor Cycle";
			break;
		case "blue": 
			transportation = "Bently";
			break;
		case "indigo": 
			transportation = "Honda";
			break;
		case "violet": 
				transportation = "Jet";
				break;
		default:  
			transportation = "Both Your Legs";
			break;	
		}
		
		
		
		
		
		System.out.println("Please enter the number of siblings you have");
		userAnswer = input.nextLine();
		
		//check if user enters quit
				if (userAnswer.toLowerCase().equals("quit"))
				{	System.out.println("Nobody likes a quitter");
					System.exit(0);
				}
	
			siblings = Integer.parseInt(userAnswer);
				
				
		//Determine years to retire based on user's age
		if (age%2 == 0) yearsToRetire = 14;
		else yearsToRetire = 13;
		
		
		
		
		//Determine vacationHomeLocation based on number of siblings user entered.
		switch (siblings){
		case 0: 
			vacationHomeLocation = "Jamaica";
			break;
		case 1: 
			vacationHomeLocation = "Florida";
			break;
		case 2: 
			vacationHomeLocation = "Bamuda";
			break;
		case 3: 
			vacationHomeLocation = "Paris";
			break;
		case 4: 
			vacationHomeLocation = "Aruba";
			break;
		case 5: 
			vacationHomeLocation = "Bahamas";
			break;
		default:
			vacationHomeLocation = "Tanganyika";
			break;	
		}
    
	
	
		
		//Determine the amount in the bank based on the birthMonth user entered.
		if(birthMonth >=1 && birthMonth <=4) balanceInBank = 555000.00;
		else if (birthMonth >4 && birthMonth <=8) balanceInBank = 665000.00;
		else if (birthMonth >9 && birthMonth <=12) balanceInBank = 1000897.00;
		else balanceInBank = 0.00;
		
		
		//format balanceInBank from double to currency
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		

		//output results
		System.out.println("\n \nFortune Teller Results \nFirst name: " + firstName + "\nLast name: " + lastName + "." );
		System.out.println("You will retire in " + yearsToRetire + " years with " + (formatter.format(balanceInBank)) +
							" in the Bank.");
		System.out.println("Your vacation home will be located in " + vacationHomeLocation);
		System.out.println("Your will be travelling by " + transportation +".");		
		
		
	
	}

}


