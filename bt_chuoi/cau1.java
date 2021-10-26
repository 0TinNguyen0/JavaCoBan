
package bt_chuoi;

import java.util.Scanner;

public class cau1 {
     public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        System.out.println();
        System.out.print("Chuỗi được xóa khoản trắng: ");
        str = str.replaceAll(" ", "");
        System.out.println(str);
        
        
    }
}
