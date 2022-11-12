package main;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        // O(n) time | O(n) space
        int[] arrayOfProducts = new int[array.length];
        int product = 1;

        for(int i = 0; i < array.length; i++){
            arrayOfProducts[i] = product;
            product *= array[i];

        }

        product = 1;
        for( int i = array.length-1; i>= 0; i--){
            arrayOfProducts[i] *= product;
            product*=array[i];

        }


        return arrayOfProducts;
    }
}
