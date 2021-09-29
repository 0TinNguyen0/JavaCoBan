
package soam_soduong;

import java.util.Scanner;

public class in_ra_ngay {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên:");
        int so = sc.nextInt();
        int temp = so % 7 ;
        switch ( temp ) {
            case  0 -> System.out.println("Monday");
            case  1 -> System.out.println("Tuesday");
            case  2 -> System.out.println("Wednesday");
            case  3 -> System.out.println("Thursday");
            case  4 -> System.out.println("Friday");
            case  5 -> System.out.println("Saturday");
            case  6 -> System.out.println("Sunday");
            default -> {
            }
        }  
    }
}