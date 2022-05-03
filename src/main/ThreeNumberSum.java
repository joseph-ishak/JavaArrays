package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // 	O(n^2) time | O(n) space
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i ++){

            int leftPointer = i + 1;
            int rightPointer =  array.length - 1;

            while(leftPointer < rightPointer){

                int currentSum= array[i] + array[leftPointer] + array[rightPointer];

                if (currentSum == targetSum){
                    triplets.add(new Integer[] {array[i],array[leftPointer],array[rightPointer]});
                    rightPointer--;
                    leftPointer++;
                }
                else if  (currentSum > targetSum){
                    rightPointer--;
                }
                else{
                    leftPointer++;
                }
            }

        }


        return triplets;

    }
}
