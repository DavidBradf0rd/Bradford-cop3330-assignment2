package ex36;

import ex25.Password;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CompStatsTest {

    @Test
    void main() {
    }

    @Test
    void average() {
        ArrayList<Double> numbers = new ArrayList<>();
        Collections.addAll(numbers,100D,200D,1000D,300D);
        double expected = 400;
        double actual = CompStats.average(numbers);
        assertEquals(expected, actual);

    }

    @Test
    void max() {
        ArrayList<Double> numbers = new ArrayList<>();
        Collections.addAll(numbers,100D,200D,1000D,300D);
        double expected = 1000;
        double actual = CompStats.max(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void min() {
        ArrayList<Double> numbers = new ArrayList<>();
        Collections.addAll(numbers,100D,200D,1000D,300D);
        double expected = 100;
        double actual = CompStats.min(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void std() {
        ArrayList<Double> numbers = new ArrayList<>();
        Collections.addAll(numbers,100D,200D,1000D,300D);
        double expected = 353.5533905932738;
        double actual = CompStats.std(numbers);
        assertEquals(expected, actual);
    }
}