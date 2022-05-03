package main;

import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int leftPointer = 0;
        int rightPointer = array.size()-1;
        while(leftPointer < rightPointer){

            while(leftPointer < rightPointer &&  array.get(rightPointer) == toMove) rightPointer--;
            if ( array.get(leftPointer) == toMove) swap(array,leftPointer, rightPointer);
            leftPointer++;
        }
        return array;
    }

    public static void swap(List<Integer> arr, int left, int right){

        int temp = arr.get(right);

        arr.set(right, arr.get(left));
        arr.set(left, temp);
    }
}
