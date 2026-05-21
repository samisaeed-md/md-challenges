public class PasswordChecker {
    String password = "password1234";

    void main() {
        System.out.println("Password: " + password);
    }

    boolean checkPasswordLength() {
        return password.length() >= 8;
    }

    boolean checkPasswordLetter() {
        return password.matches(".*[A-Za-z].*");
    }

    boolean checkPasswordNumber(){
        return password.matches(".*[0-9].*");
    }

}

