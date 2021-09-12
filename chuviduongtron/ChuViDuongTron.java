
package chuviduongtron;
   import java.util.Scanner;
public class ChuViDuongTron {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Nhập bán kính: ");
       double r= input.nextDouble();
       System.out.print("Chu vi đường tròn là: "+(2*r*3.14));
    }
}
