/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_02;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner input = new Scanner(System.in);
		final double PI = 3.14159265359;
                System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
                double area = radius * radius * PI;
		double volume = area * length;
                System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
                
    }
    
}
