package test.java;

import main.java.SortedSquareArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortedSquareArrayTest {

    @Test
    public void testSortedSquaredArray() {
        int[] output = SortedSquareArray.sortedSquaredArray(new int[] {-6,-3,2,12});

        assertEquals(Arrays.toString(new int[] {4,9,36,144}),Arrays.toString(output));

    }

}
