/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_06;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
	int number = input.nextInt();
        int lessThan10 = number % 10;number /= 10;							
	int tens = number % 10;				
	number /= 10;							
	int hundreds = number % 10;		
	number /= 10;							
	int sum = hundreds + tens + lessThan10;	

		
	System.out.println("The sum of the digits is " + sum);
    }
    
}
