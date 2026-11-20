package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    Map<String, String> map = new HashMap<>();

    public LoginService() {
        map.put("Yalini","Yalini2106");
    }

    public boolean validate(String username, String password) {
        // Check if username id present in the Map
        if(map.containsKey(username)){
            String originalPassword = map.get(username);
            if(originalPassword.equals(password))
                return true;
            else
                return false;
        }
        else
            return false;


    }
}