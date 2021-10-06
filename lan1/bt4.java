
package lan1;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, balance;
        int sum = 0; 
        System.out.println("Nhập vào 1 chữ số bất kỳ: ");
        number = sc.nextInt();
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
        System.out.println("Tổng các chữ số = " + sum);
    }
 
}

