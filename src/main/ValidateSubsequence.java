package main;

public class ValidateSubsequence {

    /**
     * Determine if a sequence is a subsequence of an array
     *
     * O(n) Time | O(1) Space
     *
     * @param array
     * @param subsequence
     * @return true if the sequence is a subsequence, else false
     */
    public static boolean isSubsequence(int[] array, int[] subsequence ){

        int arrayIndex = 0;
        int subsequenceIndex = 0;

        while (arrayIndex < array.length && subsequenceIndex < subsequence.length){
            // Only move on to the next sequence to find, if there is a match in the array
            if ( array[arrayIndex] == subsequence[subsequenceIndex]){
                subsequenceIndex++;
            }
            arrayIndex++;

        }
        return subsequenceIndex == subsequence.length;
    }
}
