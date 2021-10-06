
package lan2;

import java.util.Scanner;

public class bt7 {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;
    
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        System.out.printf("Tổng của các chữ số "
                + "của %d là: %d", n, totalDigitsOfNumber(n));
    }
     
    
    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}

