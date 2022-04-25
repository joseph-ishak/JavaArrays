package test;

import main.SortedSquareArray;
import main.TwoNumberSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortedSquareArrayTest {

    @Test
    public void TestCase1() {
        int[] output = SortedSquareArray.sortedSquaredArray(new int[] {-6,-3,2,12});

        assertEquals(Arrays.toString(new int[] {4,9,36,144}),Arrays.toString(output));

    }

}
