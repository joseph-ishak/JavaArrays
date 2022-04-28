package main;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int calculateNonConstructibleChange(int[] coins){
        // O(nlogn) time | O(1) space

        Arrays.sort(coins);
        int currentChange = 0;

        for (int coin : coins){

            if (coin > currentChange+1) {
                return currentChange + 1;
            }

            currentChange += coin;

        }
        return currentChange +1;

    }
    }
