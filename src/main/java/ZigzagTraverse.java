package main.java;

import java.util.ArrayList;
import java.util.List;

public class ZigzagTraverse {

    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        List<Integer> zigzag = new ArrayList<>();
        int width = array.get(0).size()-1;
        int height = array.size()-1;
        int row = 0;
        int col = 0;
        boolean goingDown = true;
        while(!isOutOfBounds(row, height, col, width)){

            zigzag.add(array.get(row).get(col));
            if(goingDown){
                if ( col == 0 || row == height ){
                    goingDown = false;
                    if ( row == height){
                        col++;
                    }
                    else{
                        row++;
                    }
                }
                else{
                    row++;
                    col--;
                }
            }
            else{
                if(col == width || row == 0){
                    goingDown=true;
                    if(col == width ){
                        row++;
                    }
                    else{
                        col++;
                    }
                }
                else{
                    row--;
                    col++;
                }
            }
        }



        return zigzag;

    }

    public static boolean isOutOfBounds(int row, int height, int col, int width){
        return row < 0 || row > height || col < 0 || col > width;
    }

}
