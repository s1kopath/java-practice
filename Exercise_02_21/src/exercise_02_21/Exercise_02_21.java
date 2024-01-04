/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_21;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

		
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble();
		monthlyInterestRate /= 1200;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		double futureInvestmentValue = 
		amount * Math.pow(1 + monthlyInterestRate, years * 12);
		
		
		System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
    
}
