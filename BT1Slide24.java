package baitap;
import java.util.Random;
import java.util.Scanner;
public class BT1Slide24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên: ");
        int number1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int number2 = sc.nextInt();
        if( number1 >= number2){
            System.out.println(number1 + " - " + number2 + " bằng bao nhiêu: ");
        int so = sc.nextInt();
        if(so == (number1 - number2)){
            System.out.println("Đúng");
        }
        else{
            System.out.println("Sai");
        }
        
    }
}   
}