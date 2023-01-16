package main.java;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // O(nlogn  + mlogm ) time | O(1) space
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int idxOne = 0;
        int idxTwo = 0;

        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){

            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if(firstNum == secondNum){
                return new int[] {firstNum,secondNum};
            }

            if(firstNum < secondNum){
                current = secondNum - firstNum;
                idxOne++;
            } else{
                current = firstNum - secondNum;
                idxTwo++;
            }

            if (smallest > current){
                smallest  = current;
                smallestPair = new int[] {firstNum, secondNum};
            }
        }


        return smallestPair;
    }
}
