/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbooleanoperators;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class TestBooleanOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 2 == 0 && number % 3 == 0)
    System.out.println(number + " is divisible by 2 and 3.");
        if (number % 2 == 0 || number % 3 == 0)
    System.out.println(number + " is divisible by 2 or 3.");
        
    if (number % 2 == 0 ^ number % 3 == 0)
    System.out.println(number +" is divisible by 2 or 3, but not both.");
    }
    
}
