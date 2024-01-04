/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_04_17;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_04_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

		// Prompt the user to enter a year and
		// the first three letter of a month name
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();

		// Test for leap year
		boolean leapYear = 
			((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		// Display the number of day in the month
		System.out.print(month + " " + year + " has ");
		
		if ( month.equals("Jan") || month.equals("Mar") || 
			  month.equals("May") || month.equals("Jul") ||
			  month.equals("Aug") || month.equals("Oct") ||
			  month.equals("Dec"))
			System.out.println(31 + " days");
		else if (month.equals("Apr") || month.equals("Jun") || 
			month.equals("Sep") || month.equals("Nov"))
			System.out.println(30 + " days");
		else
			System.out.println(((leapYear) ? 29 : 28) + " days");	
    }
    
}
