
package bt2_thua_ke;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class StudentManagement {
    Student[] students;	
public static void Show(Student[] students) {
    for (Student o: students) {
	System.out.println(o.toString());
	System.out.println("");
	}
}	
public static Student[] sortStudent(Student[] stds) {
    for(int i = 0; i < stds.length - 1; i++) {
	for(int j = i + 1; j < stds.length; j++) {
            if(stds[i].compareTo(stds[j]) == -1) {
                Student temp = stds[i];
		stds[i] = stds[j];
		stds[j] = temp;
            }
        }
    }
    return stds;		
}
public void write(Student[] student) { 		
    try {   
        FileOutputStream f = new FileOutputStream("D:\\bt2");  
        ObjectOutputStream OS = new ObjectOutputStream(f); 
        OS.writeObject(student);   
        OS.close();
} 
    catch (IOException e) {
        System.out.println("Lỗi ghi tệp");
    } 
}
    public Student[] read() {   	
        Student[] student = null;
        try {   
            FileInputStream f = new FileInputStream("D:\\bt2"); 
            ObjectInputStream inStream = new ObjectInputStream(f);       
            student = (Student[]) inStream.readObject();
            inStream.close();
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy lớp");
        } 
        catch (IOException e) {
            System.out.println("Lỗi đọc tệp");
    }
        return student;
}	
public static void main(String[] args) {		
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập số lượng sinh viên");
        int n = input.nextInt();		
        StudentManagement list = new StudentManagement();
            list.students = new Student[n];		
        for(int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên " + (i + 1) + ": ");
            list.students[i] = new Student();
            list.students[i].setInfo();
	}
            Show(list.students);
            Student[] result = sortStudent(list.students);
            System.out.println("Sau khi sắp xếp xong: ");
            Show(result);
            list.write(result);
            Student[] resultReadFile = list.read();
            System.out.println("Đọc được từ file :");
            Show(resultReadFile);
	}
}

