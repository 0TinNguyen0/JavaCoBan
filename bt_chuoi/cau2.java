
package bt_chuoi;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        System.out.println();
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
          if(Character.isLetter(charArray[i])) {
            if(foundSpace) {
              charArray[i] = Character.toUpperCase(charArray[i]);
              foundSpace = false;
            }
          }
          else {
            foundSpace = true;
          }
        }
        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: " + str);

        
    }
    

}
