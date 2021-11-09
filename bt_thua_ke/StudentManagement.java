
package bt_thua_ke;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> Management;
    public StudentManagement(){
        this.Management = new ArrayList<Student>();
    }
    public StudentManagement (ArrayList<Student> Management){
        this.Management = Management;
    }
    public void AddStudent(Student sv){
        this.Management.add(sv);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StudentManagement SM = new StudentManagement();
        int luachon = 0;
        do {
            System.out.println("MENU");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
             "1. Nhập dữ liệu cho danh sách sinh viên từ bàn phím.\n"
            +"2. In kết quả danh sách ra màn hình.\n"
            +"3. Tìm kiếm sinh viên theo năm sinh, kết quả trả về danh sách các sinh viên có cùng năm sinh.\n"
            +"4. Tìm kiếm sinh viên theo tên, kết quả trả về danh sách các sinh viên thỏa mãn điều kiện tìm kiếm.\n"
            +"5. Thoát khỏi chương trình");
            luachon = sc.nextInt();
            if(luachon == 1){
                System.out.println("studentID: "); 
                System.out.println("academic_year: ");                 
                System.out.println("specialized: "); 
                String studentID = sc.nextLine();
                String specialized = sc.nextLine();
                int academic_year = sc.nextInt();
            }else if(luachon == 2){
                
            }else if(luachon == 3){
                
            }else if(luachon == 4){
                             
            }
        }while(luachon!= 5);
}
}

 