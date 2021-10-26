
package btjava;

import java.util.Scanner;

public class giaiptbat1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        if (a==0){
            if (b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
                System.out.println("Phương trình có nghiệm duy nhất: "+ (-b/a));
        }
            
    }
    
}
