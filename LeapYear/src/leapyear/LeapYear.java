/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;
import java.util.Scanner;
/**
 *
 * @author Sykopath
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();
 
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    System.out.println(year + " is a leap year? " + isLeapYear);

    }
    
}
