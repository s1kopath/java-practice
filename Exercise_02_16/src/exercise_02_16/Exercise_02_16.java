/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_16;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

		
		System.out.println("The area of the hexagon is " + area); 

    }
    
}
