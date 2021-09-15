package baitap;
import java.util.Random;
import java.util.Scanner;
public class BT1Slide24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random so1 = new Random();
        Random so2 = new Random();
            
        int number1 = so1.nextInt(100);
        int number2 = so2.nextInt(100);
        if( number1 >= number2){
            
        System.out.println(number1 + " - " + number2 + " bằng bao nhiêu: ");
        int so = input.nextInt();
        if(so == (number1 - number2)){
            System.out.println("Đúng");
        }
        else{
            System.out.println("Sai");
        }
        
    }
    }   
}