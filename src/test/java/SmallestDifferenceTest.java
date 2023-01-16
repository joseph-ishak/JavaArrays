package test.java;

import main.java.SmallestDifference;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SmallestDifferenceTest {

    @Test
    public void testSmallestDifference() {
        int[] expected = {28, 26};
        assertTrue(
                Arrays.equals(
                        SmallestDifference.smallestDifference(
                                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
                        expected));
    }
}
