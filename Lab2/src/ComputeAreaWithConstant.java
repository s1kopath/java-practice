/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputeAreaWithConstant;
import java.util.Scanner; 
/**
 *
 * @author Sykopath
 */
public class ComputeAreaWithConstant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14159; 
  Scanner input = new Scanner(System.in);

System.out.print("Enter a number for radius: ");
 double radius = input.nextDouble();

double area = radius * radius * PI;

 System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
    
}
