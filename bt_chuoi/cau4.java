
package bt_chuoi;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        String[] words = str.split(" ");
        for (String w : words) {
         System.out.println(w);
        }
    }
}
