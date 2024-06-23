package org.jossegonnza;

public class PasswordValidation {

    public Boolean validation(String password) {
        if (password.length() >= 8){
            return true;
        }
        return false;
    }

}
