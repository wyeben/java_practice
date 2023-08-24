package tdd;

import org.junit.Test;
import tdd.classwork.ArrayRearrangement;

import static org.junit.Assert.assertArrayEquals;

public class ArrayRearrangementTest {
    @Test

    public void canRearrangeArray() {
        int[] giving = {1, 2, 3, 4, 5, 6};
        int[] expectedOutputArray = {2, 1, 4, 3, 6, 5};

        int[] resultArray = ArrayRearrangement.rearrangeArray(giving);

        assertArrayEquals(expectedOutputArray, resultArray);
    }

    @Test

    public void canSwapOddNumbers() {
        int[] giving = {45, 52, 11, 33, 48, 25};
        int[] expectedArray = {45, 52, 33, 11, 48, 25};

        int[] resultArray = ArrayRearrangement.swapOddPairs(giving);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void canSwapNumbers() {
        int[] giving = {25, 48, 33, 11, 52, 45};
        int[] expectedArray = {45, 52, 11, 33, 48, 25};

        int[] resultArray = ArrayRearrangement.swapNumbers(giving);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test

    public void canMinusTwoFromOddNumbers() {
        int[] giving = {22, 41, 15, 8, 2, 1};
        int[] expectedArray = {39, 13, -1};

        int[] resultArray = ArrayRearrangement.subtractTwoFromOdds(giving);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void canSplitNumbers() {
        int[] given = {23, 45, 60, 38};
        int[] expectedResult = {2, 3, 4, 5, 6, 0, 3, 8};

        int[] actualResult = ArrayRearrangement.numbersToDigitArray(given);

        assertArrayEquals(expectedResult, actualResult);

    }
}