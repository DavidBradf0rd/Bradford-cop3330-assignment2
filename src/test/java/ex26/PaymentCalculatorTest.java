package ex26;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PaymentCalculatorTest {


    @Test
    void calculateMonthsUntilPaidOff() {
        int expected = 0;
        int actual =  PaymentCalculator.calculateMonthsUntilPaidOff(5000,12, 100);
        assertEquals(expected, actual);
    }

    @Test
    void main() {

    }
}