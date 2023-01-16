package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // o(N^3) time | o(N^2)
        Map<Integer, List<Integer[]>> pairs = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<>();
        for(int i = 1; i<array.length-1; i++){

            for (int j = i+1; j< array.length; j++){
                int currentSum = array[i] + array[j];
                int difference = targetSum - currentSum;
                if (pairs.containsKey(difference)){
                    for (Integer[] pair : pairs.get(difference)){
                        Integer[] newQuad = {pair[0], pair[1], array[i], array[j]};
                        quadruplets.add(newQuad);
                    }
                }
            }
            for (int k = 0; k < i; k++){
                int currentSum = array[i] + array[k];
                Integer[] pair= {array[i], array[k]};
                if (!pairs.containsKey(currentSum)){
                    List<Integer[]> newPair = new ArrayList<>();
                    newPair.add(pair);
                    pairs.put(currentSum, newPair);
                }
                else{
                    pairs.get(currentSum).add(pair);
                }
            }
        }
        return quadruplets;
    }
}
