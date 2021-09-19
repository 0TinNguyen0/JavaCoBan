
package btjava1;

import java.util.Scanner;

public class dangnhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usename = "HuyHoang";
        String password = "2021";
        System.out.println("Nhập Usename: ");
        String Usename = sc.nextLine();
        System.out.println("Nhập Password: ");
        String Password = sc.nextLine();
        if((usename.equals(Usename)) && (password.equals(Password))){
            System.out.println("Nhập Đúng");
        }else{
            System.out.println("Nhập Sai");
        }
    }
}
