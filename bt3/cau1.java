
package bt3;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào độ Fahrenheit cần đổi: ");
    double fahrenheit = sc.nextDouble();
    double celsius = (double) 5 * (fahrenheit-32)/9;
    System.out.println(fahrenheit + " độ F = " + celsius + " độ C");
}
    }

