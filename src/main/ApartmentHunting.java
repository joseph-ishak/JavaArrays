package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ApartmentHunting {
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {

        int[][] minDistancesFromBlocks = new int[reqs.length][];  // for each erquirement we get the min dinstances

        // Go through the requirements
        for(int i = 0 ; i < reqs.length; i++){

            // Get the min distances for each reqruirement
            minDistancesFromBlocks[i] = getMinDistances(blocks, reqs[i]);
        }

        // get thte max disttances
        int[] maxDistances = getMaxDistances(minDistancesFromBlocks);
        // return the idx at the smallest max distance
        return getIdAtMinValue(maxDistances);

    }

    public static int getIdAtMinValue(int[] array){
        int idxAtMinValue = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int currentValue =  array[i];
            if ( currentValue < minValue ) {
                minValue = currentValue;
                idxAtMinValue = i;
            }
        }
        return idxAtMinValue;
    }

    public static int[] getMinDistances(List<Map<String, Boolean>> blocks, String req){



        int[] minDistances = new int[blocks.size()];
        int closestReqIdx = Integer.MAX_VALUE;
        System.out.println("Looking for closest " + req);
        // loop Through the blocks from left to rright
        //     and keep track of the requirement that came before me
        for(int i = 0 ; i < blocks.size(); i++ ){

            // set closest idx to the current idx if the requirerment is at this block
            closestReqIdx = getClosestIndexIfReqIsHere(blocks, req, closestReqIdx, i);

            minDistances[i] = distanceBetween(i, closestReqIdx);

            System.out.println(Arrays.toString(minDistances));
        }


        //   for each of the requirements go though the blocks form right to left
        //     and keep track of the requirerment that came after me
        for(int i = blocks.size()-1; i>=0; i--){

            closestReqIdx = getClosestIndexIfReqIsHere(blocks, req, closestReqIdx, i);

            minDistances[i] = Math.min(minDistances[i], distanceBetween(i, closestReqIdx));

        }

        return minDistances;

    }


    public static int[] getMaxDistances(int[][] minDistancesFromBlocks){
        int[] maxDistances = new int[minDistancesFromBlocks[0].length];
        for(int i = 0; i < minDistancesFromBlocks[0].length; i++){
            int[] minDistancesAtBlocks = new int[minDistancesFromBlocks[0].length];
            for (int j = 0; j <  minDistancesFromBlocks.length; j++){
                minDistancesAtBlocks[j] = minDistancesFromBlocks[j][i];
            }
            maxDistances[i] = arrayMax(minDistancesAtBlocks);
        }

        return maxDistances;
    }
    public static int getClosestIndexIfReqIsHere(List<Map<String, Boolean>> blocks, String req, int closestIdx, int currentIndex){
        if (blocks.get(currentIndex).get(req)) return currentIndex;

        return closestIdx;
    }
    public static int distanceBetween(int a, int b ){
        System.out.println("Getting distance betwteen " + a + " and "+ b);
        return Math.abs(a-b);
    }

    public static int arrayMax(int[] array)
    {
        int max = array[0];
        for(int a : array){
            if (a > max) max = a;
        }
        return max;
    }
}
