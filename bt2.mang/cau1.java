
package bt2;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        cau1.getValues(a);
        float avg = cau1.Average(a);
        System.out.print("Average of above Array: " + avg);
    }
   
    public static void getValues(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
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

