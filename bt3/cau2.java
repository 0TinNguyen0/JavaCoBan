
package bt3;

import java.util.Scanner;

public class cau2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị inch: ");
        double inch = sc.nextDouble();
        double meters = (double) inch*0.0254;
        System.out.println(inch + " inch = " + meters + " met");
     }
}
