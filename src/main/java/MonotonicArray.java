package main.java;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;

        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i-1]){
                isNonDecreasing = false;
            }
            if(array[i] > array[i-1]){
                isNonIncreasing = false;
            }
        }

        return isNonDecreasing || isNonIncreasing;

    }
}
