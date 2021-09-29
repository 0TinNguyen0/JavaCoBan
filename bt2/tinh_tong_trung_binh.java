
package bt2;

import java.util.Scanner;

public class tinh_tong_trung_binh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum = 0, j=0, x;
        System.out.println("Nhập vào 5 số: ");
        while(j<5){
            x = sc.nextInt();
         sum +=x;
         j++;
        }
         int avg = sum/5;
         System.out.println("Tổng: "+sum);
         System.out.println("Trung Bình Cộng: "+avg);
        
     
    }
}
