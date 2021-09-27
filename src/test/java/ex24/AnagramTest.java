package ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




class AnagramTest {

    @Test
    void main() {
    }

    @Test
    void isAnagram()  {
        boolean result = Anagram.isAnagram("tone","note");
        Assertions.assertTrue(result);
        boolean res = Anagram.isAnagram("joe", "mama");
        Assertions.assertFalse(res);
        
    }


}