
package dientich;
   import java.util.Scanner;
public class DienTich {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a double value: ");
        double radius = input.nextDouble();
        double area = radius*radius*3.14159;
        System.out.println("The area for the circle of radius is " + area);
    }
    
}
