package tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySwapIndexOfStrings {
    public String swapIt(String name, int[] index) {
        char[] rearrange = new char[name.length()];

        for (int i = 0; i < index.length; i++) {
            int newWord = index[i];
            rearrange[i] = name.charAt(newWord);
        }
        return new String(rearrange);
    }

    public int[] swapIndexOfNumbers(int[] input, int[] output) {
        int[] giving = new int[input.length];

        for (int i = 0; i < output.length; i++) {
            int expected = findIndex(input,output[i]);
            giving[i] = input[expected];
        }
        return giving;
    }

    private int findIndex(int[] input, int output) {
        for (int i = 0; i < input.length; i++) {
            if(input[i] == output){
                return i;
            }
        }
        return -1;
    }

    public int numberWithHighestFrequency(int[] input) {
        int expected = input[0];
        int frequency = 1;
        for (int i = 0; i < input.length; i++) {
            int newExpected = input[i];
            int counter = 1;

            for (int j = 0; j < input.length; j++) {
               if(input[j] == newExpected) {
                   counter++;
               }
            }
            if(counter > frequency){
                frequency = counter;
                expected = newExpected;
            }
        }
        return expected;
    }

}
