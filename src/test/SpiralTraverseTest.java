package test;

import main.SpiralTraverse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpiralTraverseTest {

    @Test
    public void RecursiveTestCase1() {
        int[][] input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = SpiralTraverse.recursivelySpiralTraverse(input);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void IterativeTestCase1() {
        int[][] input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = SpiralTraverse.iterativelySpiralTraverse(input);
        assertTrue(expected.equals(actual));
    }
}
