package main.java;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // O(n) Space & Time
        Set<Integer> complements = new HashSet<>();
        for (int num: array){
            int potentialMatch = targetSum - num;
            if(complements.contains(potentialMatch)){
                return new int[] {potentialMatch, num};
            }
            complements.add(num);
        }
        return new int[0];
    }
}
