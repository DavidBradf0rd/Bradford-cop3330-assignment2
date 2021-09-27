package ex25;

import ex24.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void main() {
    }

    @Test
    void passwordValidator() {
        String veryweak = "12345";
        String expected = "12345";
        String actual = Password.passwordValidator(veryweak);
        assertEquals(expected, actual);
        System.out.println();

        String weak = "abcdef";
        String expected2 = "abcdef";
        String actual2 = Password.passwordValidator(weak);
        assertEquals(expected2, actual2);
        System.out.println();

        String strong = "abc123xyz";
        String expected3 = "abc123xyz";
        String actual3 = Password.passwordValidator(strong);
        assertEquals(expected3, actual3);
        System.out.println();

        String verystrong = "1337h@xor!";
        String expected4 = "1337h@xor!";
        String actual4 = Password.passwordValidator(verystrong);
        assertEquals(expected4, actual4);



    }
}