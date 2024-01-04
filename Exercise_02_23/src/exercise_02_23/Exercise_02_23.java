/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_23;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

	
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		
		System.out.println("The cost of driving is $" + costOfDriving);
    }
    
}
