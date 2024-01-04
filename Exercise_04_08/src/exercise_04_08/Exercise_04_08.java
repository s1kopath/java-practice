/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_04_08;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_04_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
		int i = input.nextInt();

		System.out.println((char)i);
    }
    
}
