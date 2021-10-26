
package bt_chuoi;

import java.util.Scanner;

public class cau7 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse().toString());
    }
}
