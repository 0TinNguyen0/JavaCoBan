
package bt2;

import java.util.Random;

public class cau3 {
    public static void main(String[] args) {
        double avg;
        int[] a = new int[5];
        double[] b = new double[5];
        getRandValues(a);
        getRandValuesR(b);
        avg = Average(a, b);
        System.out.println("Average: " + avg);
    }
   
    public static void getRandValues(int[] a) {
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100)+1;
        }
        System.out.println("Array a: ");
        for(int i = 0; i < a.length; i++)               
        System.out.println(a[i]);
    }
    
    public static void getRandValuesR(double[] b) {
        System.out.println("Enter values: ");
        for (int i = 0; i < b.length; i++) {
            double randomDouble = Math.random();
            b[i] = randomDouble;
        }
        System.out.println("Array b: ");
        for(int i = 0; i < b.length; i++)               
        System.out.println(b[i]);
    }
    
    public static double Average(int[] a, double[] b) {
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i]*b[i];
        }
        avg /= (double)(a.length);
        return avg;
    }
}

