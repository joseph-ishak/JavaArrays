package main.java;

public class SubarraySort {

    public static int[] subarraySort(int[] array) {
        // O(n) time | O(1) space
        int minOutOfOrder = Integer.MAX_VALUE;
        int maxOutOfOrder = Integer.MIN_VALUE;

        for ( int i = 0 ; i < array.length; i++){
            int num = array[i];
            if(isOutOfOrder(i, num, array)){
                minOutOfOrder = Math.min(minOutOfOrder, num);
                maxOutOfOrder = Math.max(maxOutOfOrder, num);
            }

        }
        if (minOutOfOrder == Integer.MAX_VALUE) return new int[] {-1,-1};
        int leftSubArrayIndex = 0;
        int rightSubArrayIndex = array.length-1;

        while(minOutOfOrder >= array[leftSubArrayIndex]){
            leftSubArrayIndex++;
        }
        while(maxOutOfOrder <= array[rightSubArrayIndex]){
            rightSubArrayIndex--;
        }
        return new int[] {leftSubArrayIndex, rightSubArrayIndex};
    }
    public static boolean isOutOfOrder(int i, int num, int[] array){
        if ( i==0 ) return num > array[i+1];

        if (i == array.length-1) return num < array[i-1];

        return num> array[i+1] || num < array[i-1];
    }

}
