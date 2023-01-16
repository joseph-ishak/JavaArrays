package test.java;

import main.java.ValidateSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidateSubsequenceTest {

    @Test
    public void testValidateSubsequence(){
        boolean isSub  = ValidateSubsequence.isSubsequence(new int[] {1,2,4,6,7,8}, new int[] {1,4,8});
        assertEquals(isSub, true);
    }


    @Test
    public void testValidateSubsequence2(){
        boolean isSub  = ValidateSubsequence.isSubsequence(new int[] {1,2,4,6,7,8}, new int[] {1,4,16});
        assertEquals(isSub, false);
    }
}
