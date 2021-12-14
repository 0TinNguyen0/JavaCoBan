
package soam_soduong;

import java.util.Scanner;

public class soam_soduong {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Nhập số bất kì: ");
    int a = sc.nextInt();
    if(a>0){
        System.out.println("Số Dương");
    }
    else{
        System.out.println("Số Âm");
    
    }
}
}