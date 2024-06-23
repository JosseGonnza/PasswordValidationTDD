package org.jossegonnza;


public class PasswordValidation {

    public Boolean validation(String password) {
        char letter;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean hasNumber = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            letter = password.charAt(i);

            if (Character.isUpperCase(letter)) {
                isUpperCase = true;
            } else if (Character.isLowerCase(letter)) {
                isLowerCase = true;
            } else if (Character.isDigit(letter)){
                hasNumber = true;
            }

            if (isUpperCase && isLowerCase && hasNumber == true) {
                return true;
            }

        }
        return false;
    }


}
