
package bt2_thua_ke;

import java.util.Scanner;
public class Student extends Person {
@Override
public int compareTo(Student o) {		
    if(this.getGpa() > o.getGpa()) {
	return 1;
    }else if(this.getGpa() == o.getGpa()) {
    if(this.getSoicialActivities() > o.getSoicialActivities()) {
	return 1;
    }else if(this.getSoicialActivities() == o.getSoicialActivities()) {
	return 0;
    }else{
	return -1;
	}
    }
	return -1;
}
@Override
public String toString() {
    return "Student: studentID: " + studentID + ", academicYear: " + academicYear + ", gpa: " + gpa + ", soicialActivities: " 
                                  + soicialActivities + ", name: " + name + ", gender: " + gender + ", birthYear: " + birthYear;
}

    public String getStudentID() {
	return studentID;
    }
    
    public void setStudentID(String studentID) {
	this.studentID = studentID;
    }
    
    public int getAcademicYear() {
	return academicYear;
    }
    
    public void setAcademicYear(int academicYear) {
	this.academicYear = academicYear;
    }
    
    public float getGpa() {
	return gpa;
    }
    
    public void setGpa(float gpa) {
	this.gpa = gpa;
    }
    
    public float getSoicialActivities() {
    	return soicialActivities;
    }
    
    public void setSoicialActivities(float soicialActivities) {
	this.soicialActivities = soicialActivities;
    }
    
    String studentID;
    int academicYear;
    float gpa;
    float soicialActivities;
	public Student(String name, char gender, int birthYear, String studentID, int academicYear, float gpa,float soicialActivities) {
            super(name, gender, birthYear);
            this.studentID = studentID;
            this.academicYear = academicYear;
            this.gpa = gpa;
            this.soicialActivities = soicialActivities;
    }
    public Student() {
	super();
	}
    public void setInfo() {
	Scanner input = new Scanner(System.in);
	System.out.print("Nhập họ tên: ");
	this.setName(input.next());
	System.out.print("Nhập mã sv: ");
	this.setStudentID(input.next());	
	System.out.print("Nhập năm sinh: ");
	this.setBirthYear(input.nextInt());
	System.out.print("Nhập giới tính: ");
	this.setGender(input.next().charAt(0));	
	System.out.print("Nhập năm học: ");
	this.setAcademicYear(input.nextInt());	
	System.out.print("Nhập gpa: ");
	this.setGpa(input.nextFloat());	
	System.out.print("Nhập soicialActivities: ");
	this.setSoicialActivities(input.nextFloat());
    }
}