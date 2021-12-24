
package bai_tap_lon;

public class Student {
    private String StudentID;
    private String Name;
    private String Gender;
    private String Birthday;
    private String IdentityCard;
    private String Phone;
    private String Email;
    private String Address;
    private String Subject;
    private double Marks; 

    public Student() {
    }

    public Student(String StudentID, String Name, String Gender, String DateOfBirth, String IdentityCard, String Phone, String Email, String Address, String Subject, double Marks) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.Gender = Gender;
        this.Birthday = DateOfBirth;
        this.IdentityCard = IdentityCard;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.Subject = Subject;
        this.Marks = Marks;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getIdentityCard() {
        return IdentityCard;
    }

    public void setIdentityCard(String IdentityCard) {
        this.IdentityCard = IdentityCard;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double Marks) {
        this.Marks = Marks;
    }

}
