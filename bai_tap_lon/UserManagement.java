
package bai_tap_lon;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    List<User> ls = new ArrayList<>();  

    public UserManagement() {
        ls.add(new User("admin", "admin", true));
        ls.add(new User("admin", "123456", true));
    }
    public boolean checkLogin(String Username, String Password){
        for (User u: ls){
            if(u.getUsername().equals(Username)&& u.getPassword().equals(Password)){
                return true;
            }
        }
        return false;
    }
}
