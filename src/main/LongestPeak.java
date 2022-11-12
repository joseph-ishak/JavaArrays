package main;

public class LongestPeak {


    public static int longestPeak(int[] array) {
        // O(n) time |  O(1) space
        int longestPeak = 0;
        int i = 1;
        while ( i< array.length-1){
            boolean isPeak = array[i] > array[i-1] && array[i] > array[i+1];
            if (!isPeak){
                i+=1;
                continue;
            }
            int leftIndex = i-2;
            while(leftIndex >= 0 && array[leftIndex] < array[leftIndex+1]){
                leftIndex-=1;
            }
            int rightIndex = i+2;
            while(rightIndex < array.length && array[rightIndex] < array[rightIndex-1]){
                rightIndex+=1;
            }

            int currentPeakLength = rightIndex - leftIndex-1;
            longestPeak = Math.max(longestPeak, currentPeakLength);
            i = rightIndex;


        }
        return longestPeak;
    }
}
