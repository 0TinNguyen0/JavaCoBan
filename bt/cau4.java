
package bt;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a , b;
        System.out.println("Enter a and b: ");
        a = input.nextFloat();
        b = input.nextFloat();
        Equation(a, b);
    }
    public static void Equation(double a, double b) {
        double x = -b/a;
        if (a == 0) {
            System.out.println("No solution!");
        } else {
            System.out.println("x = " + x);
        }
    }    

    static void Quadratic(float a, float b, float c) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}