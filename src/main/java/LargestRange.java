package main.java;

import java.util.HashMap;
import java.util.Map;

public class LargestRange {

    public static int[] largestRange(int[] array) {
        // O(n) time and O(n) space

        int[] longestRange = new int[2];
        Map<Integer,Boolean> lookup = new HashMap<>();
        int longestLength = 0;
        for(int number: array){
            lookup.put(number, false);
        }

        for (int num : array){

            if(!lookup.containsKey(num)){
                continue;
            }
            int currentLength = 1;
            int leftNumber = num-1;
            int rightNumber = num+1;
            while(lookup.containsKey(leftNumber)){
                currentLength++;
                leftNumber--;
            }
            while(lookup.containsKey(rightNumber)){
                currentLength++;
                rightNumber++;
            }

            if (currentLength >longestLength){
                longestLength = currentLength;
                longestRange = new int[] {leftNumber + 1, rightNumber -1};
            }



        }
        return longestRange;
    }
}
