package tdd;

import org.junit.Test;
import tdd.classwork.ArrayRearrangement2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayRearrangement2Test {
    @Test

    public void testRearrangeArray() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 1, 4, 3, 6, 5};
        int[] result = ArrayRearrangement2.rearrangeArray(input);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testSwapOddPairs() {
        int[] input = {1, 3, 5, 7, 9};
        int[] expected = {3, 1, 7, 5, 9};
        int[] result = ArrayRearrangement2.swapOddPairs(input);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testReverseArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = ArrayRearrangement2.reverseArray(input);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
