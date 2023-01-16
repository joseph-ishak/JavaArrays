package test.java;

import main.java.FourNumberSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.*;

public class FourNumberSumTest {
    private boolean compare(List<Integer[]> quads1, List<Integer[]> quads2) {
        for (Integer[] quad : quads2) {
            Arrays.sort(quad);
        }
        for (Integer[] quad : quads1) {
            Arrays.sort(quad);
        }
        for (Integer[] quad2 : quads2) {
            boolean found = false;
            for (Integer[] quad1 : quads1) {
                if (Arrays.equals(quad2, quad1)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return false;
            }
        }
        return true;
    }

    @Test public void testFourNumberSum() {
        List<Integer[]> output = FourNumberSum.fourNumberSum(new int[] {7, 6, 4, -1, 1, 2}, 16);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {7, 6, 4, -1});
        quadruplets.add(new Integer[] {7, 6, 1, 2});
        assertTrue(quadruplets.size() == output.size());
       assertTrue(this.compare(quadruplets, output));
    }
}
