package test.java;

import main.java.NonConstructibleChange;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonConstructibleChangeTest {


    @Test
    public void testCalculateNonConstructibleChange(){
        int result = NonConstructibleChange.calculateNonConstructibleChange(new int[] {109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4});
        assertEquals(87, result);
    }
}
