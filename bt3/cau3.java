
package bt3;

import java.util.Scanner;

public class cau3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sodu,tong = 0;
        System.out.println("Nhập 1 số nguyên từ 0 đến 1000: ");
        num = sc.nextInt();
        while (num > 0) {
        sodu = num % 10;
        num = num / 10;
        tong += sodu;
    }
         
    System.out.println("Tổng các chữ số trong " + tong);
}
 }
