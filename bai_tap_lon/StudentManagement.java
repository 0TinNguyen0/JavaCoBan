
package bai_tap_lon;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static List<Student> LS = new ArrayList<>();
    public int add(Student st){
        LS.add(st);
        return 1;
    }
    public int findStudentMSV(String MSV){
        for (int i = 0; i < LS.size(); i++){
            if(LS.get(i).getMaSinhVien().equals(MSV)){
                return i;
            }
        }
        return -1;
    } 
    public int update(Student st){
        int pos = findStudentMSV(st.getMaSinhVien());
        if (pos < 0){
            return -1;
        }else{
            LS.set(pos, st);    
        }
        return pos;
    }        
    public int del(String MSV){
        int pos = findStudentMSV(MSV);
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

    void setMSV(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
