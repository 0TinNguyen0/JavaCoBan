
package bt_thua_ke;

public class Student extends Person{
    String studentID;
    int academic_year;
    String specialized;

    public Student() {
    }

    public Student(String name, char gender, int brith_year, String address) {
        super(name, gender, brith_year, address);
    }


    Student(String studentID, int academic_year, String specialized) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", academic_year=" + academic_year + ", specialized=" + specialized + '}';
    }

  
}
