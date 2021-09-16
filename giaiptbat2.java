
package btjava1;

import java.util.Scanner;

public class giaiptbat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        System.out.println("Nhập c: ");
        float c = sc.nextFloat();
        if(a==0){
            if(b==0){
                if (c==0){
                    System.out.println("Phương trình có vô số nghiệm");
                }else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            }else{
                float delta = b*b-4*a*c;
                if( delta > 0){
                    double x1 = ((-b + Math.sqrt(delta)) / (2*a));
                    double x2 = ((-b + Math.sqrt(delta)) / (2*a)); 
                    System.out.println("Phương trình có nghiệm x1: " + "x1: "+ x1 + "x2: " + x2 );
                }else if (delta == 0){
                    System.out.println("Phương trình có nghiệm kép x1 = x2: "+ -b/(2*a));
                }else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }

