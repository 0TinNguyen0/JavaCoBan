
package so_lon_nhat;

import java.util.Scanner;

public class so_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        int c = sc.nextInt();
        if( a >= b && a >= c)
            System.out.println(a+" là số lớn nhất");
 
        else if (b >= a && b >= c)
            System.out.println(b+" là số lớn nhất");
        else
            System.out.println(c+" là số lớn nhất");
    }
}
    
