package tdd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySwapIndexOfStringsTest {
    @Test
    public void canSwapIndexOfStrings(){
        ArraySwapIndexOfStrings arraySwapIndexOfStrings = new ArraySwapIndexOfStrings();
        String name = "yilabenson";
        int[] index = {4,6,9,2,7,1,3,0,8,5};
        String output = "bnnlsiayoe";
        assertEquals(output, arraySwapIndexOfStrings.swapIt(name,index));
    }

    @Test
    public void canSwapIndexOfNumbers(){
        ArraySwapIndexOfStrings arraySwapIndexOfNumbers = new ArraySwapIndexOfStrings();
        int[] input = {9,3,5,7,2,4};
        int[] output = {3,7,9,4,5,2};
        assertArrayEquals(output, arraySwapIndexOfNumbers.swapIndexOfNumbers(input,output));
    }
    @Test
    public void canCheckNumbersWithTheHighestFrequency(){
        ArraySwapIndexOfStrings arraySwapIndexOfNumbers = new ArraySwapIndexOfStrings();
        int[] input = {3,3,2};
        int output = 3;
        assertEquals(output, arraySwapIndexOfNumbers.numberWithHighestFrequency(input));
    }
    @Test
    public void canCheckNumbersWithTheHighestFrequency2(){
        ArraySwapIndexOfStrings arraySwapIndexOfNumbers = new ArraySwapIndexOfStrings();
        int[] input = {2,2,1,1,1,2,2};
        int output = 2;
        assertEquals(output, arraySwapIndexOfNumbers.numberWithHighestFrequency(input));
    }

    @Test
    public void canAddDigits() {
        ArraySwapIndexOfStrings arraySwapIndexOfNumbers = new ArraySwapIndexOfStrings();
        int input = 38;
        int output = 2;
        assertEquals(output, arraySwapIndexOfNumbers.addDigits(input));
    }
        @Test
    public void canMoveZeros(){
        ArraySwapIndexOfStrings arraySwapIndexOfNumbers = new ArraySwapIndexOfStrings();
        int[] input = {4,3,0,2,0,4,10,12};
        int[] output = {4,3,2,4,10,12,0,0};
        assertArrayEquals(output, arraySwapIndexOfNumbers.swapIndexOfNumbers(input,output));

    }
}
