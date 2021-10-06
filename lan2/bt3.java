
package lan2;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
            int n,sothuN=1;
            int f0=1;
            int f1=1;
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap so:");
            n = input.nextInt();
            if (n>1) {
                for (int i = 2; i <=n; i++) {
                    sothuN=f0+f1;
                    f0=f1;
                    f1=sothuN;
                }
        }
        System.out.println("so thu "+n +" la " + sothuN);
    }
}
        
    


