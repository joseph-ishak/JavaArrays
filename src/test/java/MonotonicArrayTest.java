package test.java;

import main.java.MonotonicArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonotonicArrayTest {

    @Test
    public void testIsMonotonic() {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean expected = true;
        boolean actual = MonotonicArray.isMonotonic(array);
        assertEquals(expected, actual);
    }
}
