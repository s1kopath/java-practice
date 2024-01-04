/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_03;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        final double METERS_PER_FOOT = 0.305;
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * METERS_PER_FOOT;
        System.out.println(feet + " feet is " + meters + " meters");

    }
    
}
