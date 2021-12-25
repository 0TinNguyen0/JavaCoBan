
package bai_tap_lon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    public static List<Student> LS = new ArrayList<>();
    public int add(Student st){
        LS.add(st);
        return 1;
        
    }
    public int findStudentID(String StudentID){
        for (int i = 0; i < LS.size(); i++){
            if(LS.get(i).getStudentID().equals(StudentID)){
                return i;
            }
        }
        return -1;
    } 
    public int update(Student st){
        int pos = findStudentID(st.getStudentID());
        if (pos < 0){
            return -1;
        }else{
            LS.set(pos, st);    
        }
        return pos;
    }        
    public int delete(String StudentID){
        int pos = findStudentID(StudentID);
        if (pos < 0){
            return -1;
        }else{
            LS.remove(pos);
        }
        return pos;
    }
    public List<Student> getAll(){
        return LS;
    }
    
    void setStudentID(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void getSortByName() {
        Comparator<Student> comp = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {
                return s1.splitName(s1.getName()).compareTo(s2.splitName(s2.getName()));
            }   
        };
        Collections.sort(LS,comp);
    } 
    
    public void getSortByMakrs(){
        Comparator<Student> comp = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                 Double d1 = o1.getMarks();
                 Double d2 = o2.getMarks();
                 return d2.compareTo(d1);
            }
        };
        Collections.sort(LS,comp);
    }
}
