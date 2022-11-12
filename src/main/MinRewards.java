package main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinRewards {

    public static int minRewards(int[] scores) {
        // Write your code here.
        int[] awards = new int[scores.length];
        Arrays.fill(awards, 1);

        for(int i = 1; i <scores.length; i++){

            if(scores[i] > scores[i-1]){
                awards[i] = awards[i-1]+1;
            }
        }
        for (int i = scores.length-2; i >= 0; i--){
            if(scores[i] > scores[i+1]){
                awards[i] = Math.max(awards[i], awards[i+1]+1);
            }
        }

        return IntStream.of(awards).sum();
    }
}
