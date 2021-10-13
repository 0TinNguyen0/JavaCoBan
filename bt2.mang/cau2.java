
package bt2;

import java.util.Random;

public class cau2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        cau2.getRandValues(a);
        float avg = cau2.Average(a);
        System.out.print("Average of above Array: " + avg);
    }
   
    public static void getRandValues(int[] a) {
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100)+1;
        }
        System.out.println("Array: ");
        for(int i = 0; i < a.length; i++)               
        System.out.println(a[i]);
    }
    
    public static float Average(int[] a) {
        float avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= (float)(a.length);
        return avg;
    }
}

