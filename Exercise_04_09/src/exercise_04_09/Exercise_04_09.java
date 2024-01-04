/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_04_09;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class Exercise_04_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		System.out.println((int)ch);

    }
    
}
