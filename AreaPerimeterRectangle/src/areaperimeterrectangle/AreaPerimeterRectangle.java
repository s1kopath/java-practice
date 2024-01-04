/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimeterrectangle;

/**
 *
 * @author Sykopath
 */
public class AreaPerimeterRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double w = 5.3;
        double h = 8.6, a, p;
        a = w * h;
        p = 2 * (w + h);
        System.out.println("Area of rectangle: "+a);
        System.out.println("Perimeter of rectangle: "+p);
        
    }
    
}
