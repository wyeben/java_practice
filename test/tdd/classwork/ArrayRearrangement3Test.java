package tdd.classwork;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class ArrayRearrangement3Test {
    @Test

    public void canMinusTwoFromOddNumbers() {
        int[] giving = {22, 41, 15, 8, 2, 13};
        int[] expectedArray = {39, 13, -1};

        int[] resultArray = ArrayRearrangement3.OddPairs(giving);

        assertArrayEquals(expectedArray, resultArray);
    }

}