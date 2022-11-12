package test;

import main.ZigzagTraverse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagTraverseTest {


    @Test
    public void calculateNonConstructibleChangeTest(){
        List<List<Integer>> test = new ArrayList<>();
        test.add(new ArrayList<Integer>(Arrays.asList(1, 3, 4, 10)));
        test.add(new ArrayList<Integer>(Arrays.asList(2, 5, 9, 11)));
        test.add(new ArrayList<Integer>(Arrays.asList(6, 8, 12, 15)));
        test.add(new ArrayList<Integer>(Arrays.asList(7, 13, 14, 16)));
        List<Integer> expected =
                new ArrayList<Integer>(
                        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
       assertEquals(ZigzagTraverse.zigzagTraverse(test), expected);
    }
}
