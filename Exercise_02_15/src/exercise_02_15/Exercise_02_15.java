/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_15;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distance = Math.pow(Math.pow(x2 - x1, 2) +
		Math.pow(y2 - y1, 2), 0.5);

		
		System.out.println("The distance between the two points is " + distance);

    }
    
}
