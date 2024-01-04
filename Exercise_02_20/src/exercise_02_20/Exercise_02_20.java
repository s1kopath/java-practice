/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_20;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();

		
		double interest = balance * (annualInterestRate / 1200);

		
		System.out.println("The interest is " + interest);

    }
    
}
