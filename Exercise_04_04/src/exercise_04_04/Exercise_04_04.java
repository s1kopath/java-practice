/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_04_04;
import java.util.Scanner;

/**
 *
 * @author Sykopath
 */
public class Exercise_04_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

	
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The are of the hexagon is %4.2f\n", area);

    }
    
}
