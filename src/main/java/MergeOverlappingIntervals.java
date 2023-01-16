package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // O(nlogn) time and | O(n) space
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;
        int end = 1;
        List<int[]> mergedOverlaps = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedOverlaps.add(currentInterval);

        for (int i =1; i<intervals.length; i++){
            int currentIntervalEnd = currentInterval[end];
            int nextIntervalStart = intervals[i][start];
            int nextIntervalEnd = intervals[i][end];

            if(currentIntervalEnd >= nextIntervalStart){
                currentInterval[end] = Math.max(currentIntervalEnd, nextIntervalEnd);
            } else{
                currentInterval = intervals[i];
                mergedOverlaps.add(intervals[i]);
            }

        }

        return mergedOverlaps.toArray(new int[mergedOverlaps.size()][]);

    }
}
