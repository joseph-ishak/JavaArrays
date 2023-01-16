package main.java;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    public static List<Integer> iterativelySpiralTraverse(int[][] array){
        if(array.length == 0 ) return new ArrayList<Integer>();
        // O(N) time | O(N) space
        int startingRow = 0;
        int startingColumn = 0;
        int endingColumn = array[0].length-1;
        int endingRow  = array.length-1;
        List<Integer> spiralList = new ArrayList<>();


        while( startingRow <= endingRow && startingColumn <= endingColumn){

            for(int i = startingColumn; i <= endingColumn; i++ ){
                spiralList.add(array[startingRow][i]);
            }

            for(int i = startingRow+1; i <= endingRow; i++ ){

                spiralList.add(array[i][endingColumn]);
            }


            for(int i = endingColumn-1; i>= startingColumn; i--){
                if(startingRow == endingRow) break;
                spiralList.add(array[endingRow][i]);
            }

            for(int i = endingRow-1; i> startingRow; i-- ){
                if(startingColumn==endingColumn) break;
                spiralList.add(array[i][startingColumn]);
            }
            startingRow++;
            endingRow--;
            startingColumn++;
            endingColumn--;

        }


        return spiralList;
    }

    public static List<Integer> recursivelySpiralTraverse(int[][] array){
        if(array.length == 0 ) return new ArrayList<Integer>();
        List<Integer> spiralList = new ArrayList<>();
        spiralTraverse(array, 0,0, array.length-1 , array[0].length-1, spiralList);
        return spiralList;
    }

    public static void spiralTraverse(int[][]array, int startingRow, int startingColumn, int endingRow, int endingColumn, List<Integer> spiralList){

        if( startingRow > endingRow || startingColumn > endingColumn) return;


            for(int i = startingColumn; i <= endingColumn; i++ ){
                spiralList.add(array[startingRow][i]);
            }

            for(int i = startingRow+1; i <= endingRow; i++ ){

                spiralList.add(array[i][endingColumn]);
            }


            for(int i = endingColumn-1; i>= startingColumn; i--){
                if(startingRow == endingRow) break;
                spiralList.add(array[endingRow][i]);
            }

            for(int i = endingRow-1; i> startingRow; i-- ){
                if(startingColumn==endingColumn) break;
                spiralList.add(array[i][startingColumn]);
            }

            spiralTraverse(array, startingRow+1,startingColumn+1, endingRow-1 , endingColumn-1, spiralList);



    }
}
