package test;

import main.TwoNumberSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoNumberSumTest {

    @Test
    public void TestCase1() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }


    @Test
    public void TestCase2() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue(contains(output, 210));
        assertTrue(contains(output, -47));
    }

    public boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
