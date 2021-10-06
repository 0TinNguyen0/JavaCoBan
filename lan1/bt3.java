
package lan1;

import java.util.Scanner;

public class bt3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhập Chữ Số Bất Kỳ: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
