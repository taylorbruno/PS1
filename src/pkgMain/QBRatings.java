package pkgMain;

import java.util.Scanner;

public class QBRatings {


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String firstName; // Enter player's first name. 
		System.out.print("Please enter QB's first name: ");
		firstName = input.next();
		
		String lastName; //Enter player's last name
		System.out.print("Please enter QB's last name: ");
		lastName = input.next();
		
		double TD; // QB's number of TDs in one season
		System.out.print("Please enter QB's number of TDs (double format): ");
		TD = input.nextDouble();
		
		double Yards; // The QB's total amount of yards.
		System.out.print("Please enter QB's total amount of yards (double format): ");
		Yards = input.nextDouble();
		
		double Interceptions; // The QB's number of interceptions.
		System.out.print("Please enter the QB's amount of interceptions (double format): ");
		Interceptions = input.nextDouble();
		
		double comp; // The QB's number of completions
		System.out.print("Please enter the QB's amount of total completions (double format): ");
		comp = input.nextDouble();
		
		double ATT; // The QB's number of attempts
		System.out.print("Please enter the amount of passes attempted (double format): ");
		ATT = input.nextDouble();
		
		// These represent the components of the QB's overall rating 
		
		double calca = (((comp/ATT) - .3) * 5);
		double calcb = (((Yards/ATT) - 3) * .25);
		double calcc = ((TD/ATT) * 20);
		double calcd = (2.375 - ((Interceptions/ATT) * 25));
		
		// This is checking to see whether a QB has any of the above calculations 
		// to be higher than 2.375 or less than 0 and is setting it to 2.375 if any 
		// of the above conditions are true
		
		if(calca > 2.375)
			calca = 2.375;
		else if (calcb > 2.375)
			calcb = 2.375;
		else if (calcc > 2.375)
			calcc = 2.375;
		else if (calcd > 2.375)
			calcd = 2.375;
		else if (calca < 0)
			calca = 0;
		else if (calcb < 0)
			calcb = 0;
		else if (calcc < 0)
			calcc = 0;
		else if(calcd <0)
			calcd = 0;
		
		// Calculates the QB's rating.
		
		double QbRate = (((calca + calcb + calcc + calcd)/6) * 100);
		
		System.out.printf("The QB rating of" + " " + firstName + " " + lastName + " " + "is %.2f", QbRate);
		
		input.close();
	}
}