package test;

import main.ArrayOfProducts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayOfProductsTest {

    @Test
    public void TestCase1() {
        int[] input = new int[] {5, 1, 4, 2};
        int[] expected = new int[] {8, 40, 10, 20};
        int[] actual = ArrayOfProducts.arrayOfProducts(input);
        assertArrayEquals(expected, actual);
    }

}
