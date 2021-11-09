
package bt_thua_ke;

public class Person {
    private String name;
    private char gender;
    private int brith_year;
    private String address ;
    public Person() {
    }

    public Person(String name, char gender, int brith_year, String address) {
        this.name = name;
        this.gender = gender;
        this.brith_year = brith_year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBrith_year() {
        return brith_year;
    }

    public void setBrith_year(int brith_year) {
        this.brith_year = brith_year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", brith_year=" + brith_year + ", address=" + address + '}';
    }

    
}
