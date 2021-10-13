
package bt2;

import java.util.Random;

public class cau4 {
    public static void main(String[] args) {
        int[] a = new int[5];
        getRandValues(a);
    }
   
    public static void getRandValues(int[] a) {
        System.out.println("Enter values: ");
        int len = a.length;
        for (int i = 0; i < len; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(100)+1;
        }
        System.out.println("Xuoi Array a: ");
            for(int i = 0; i < len; i++) {               
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.println("Nguoc Array a: ");
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}    

