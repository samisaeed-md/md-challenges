import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {
    @Test
    void testPasswordIsAtLeast8CharactersLong(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.checkPasswordLength();
        assertTrue(result);
    }
    @Test
    void testPasswordContainsAtLeastOneLetter(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.checkPasswordLetter();
        assertTrue(result);
    }
    @Test
    void testPasswordContainsAtLeastOneNumber() {
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.checkPasswordNumber();
        assertTrue(result);
    }
}