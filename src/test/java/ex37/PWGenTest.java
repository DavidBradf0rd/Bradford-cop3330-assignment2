package ex37;

import ex25.Password;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PWGenTest {

    @Test
    void main() {
    }

    @Test
    void getsPW() {
        int t1 = 3;
        int t2 = 3;
        int t3 = 3;

        String unexpected = PWGen.getsPW(t1,t2,t3);
        String actual = PWGen.getsPW(t1,t2,t3);
        assertNotEquals(unexpected, actual);

    }
}