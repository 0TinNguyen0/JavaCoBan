/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuviduongtron;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class dientich {
        public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Nhập bán kính: ");
       double r= input.nextDouble();
       System.out.print("Chu vi đường tròn là: "+(2*r*3.14));
    }
}

