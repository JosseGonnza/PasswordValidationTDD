package org.jossegonnza;

public class PasswordValidation {

    public Boolean validation(String password) {
        char ch;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
            return true;
            }
        }

        return false;
    }
}
