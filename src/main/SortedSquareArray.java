package main;

public class SortedSquareArray {
    /**
     * Square a sorted array, where there may be negatives
     * O(n) time and O(n) space
     * @param array
     * @return the sorted squared array
     */
    public static int[] sortedSquaredArray(int[] array) {
        int leftPointer = 0;
        int rightPointer = array.length -1;
        int[] sortedSquares = new int[array.length];

        for (int idx = array.length -1; idx >= 0 ; idx--){
            int smallerValue = array[leftPointer];
            int largerValue = array[rightPointer];
            if(Math.abs(smallerValue) > Math.abs(largerValue)){
                sortedSquares[idx] = smallerValue * smallerValue;
                leftPointer++;
            } else {
                sortedSquares[idx] = largerValue * largerValue;
                rightPointer--;
            }
        }
        return sortedSquares;
    }
}
