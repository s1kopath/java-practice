/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeareawithconsoleinput;
import java.util.Scanner; 
/**
 *
 * @author Sykopath
 */
public class ComputeAreaWithConsoleInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Scanner input = new Scanner(System.in);

System.out.print("Enter a number for radius: ");
double radius = input.nextDouble();

double area = radius * radius * 3.14159;

System.out.println("The area for the circle of radius radius is "+area);
    }
    
}
