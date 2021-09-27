package ex27;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputsTest {

    @Test
    void validateInput() {

        boolean result = ValidatingInputs.validateInput("John","Johnson", "55555", "TK-4321");
        Assertions.assertTrue(result);

    }

    @Test
    void validateFName() {
        boolean result = ValidatingInputs.validateFName("Joe");
        Assertions.assertTrue(result);
        boolean res = ValidatingInputs.validateFName("J");
        Assertions.assertFalse(res);

    }

    @Test
    void validateLName() {
        boolean result = ValidatingInputs.validateLName("Mama");
        Assertions.assertTrue(result);
        boolean res = ValidatingInputs.validateLName("");
        Assertions.assertFalse(res);
    }

    @Test
    void validateZip() {
        boolean result = ValidatingInputs.validateZip("32817");
        Assertions.assertTrue(result);
        boolean res = ValidatingInputs.validateZip("ABCDE");
        Assertions.assertFalse(res);
    }

    @Test
    void validateEmpID() {
        boolean result = ValidatingInputs.validateEmpID("TK-4321");
        Assertions.assertTrue(result);
        boolean res = ValidatingInputs.validateEmpID("A12-1234");
        Assertions.assertFalse(res);

    }
}