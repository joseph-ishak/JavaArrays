package test.java;

import main.java.FirstDuplicateValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstDuplicateValueTest {

    @Test
    public void testFirstDuplicateValueInPlace() {
        int[] input = new int[] {2, 1, 5, 2, 3, 3, 4};
        int expected = 2;
        int actual = FirstDuplicateValue.firstDuplicateValue(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstDuplicateValueUsingHashSet() {
        int[] input = new int[] {2, 1, 5, 2, 3, 3, 4};
        int expected = 2;
        int actual = FirstDuplicateValue.firstDuplicateValue(input);
        assertEquals(expected, actual);
    }
}
