package tdd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsInArraysTest {

    @Test
    public void canRearrangeChar(){
        WordsInArrays wordsInArrays = new WordsInArrays();
        String words = "kissdry";
        int[] index = {6, 2, 3, 4, 1, 0, 5};
        String output = "yssdikr";
        assertEquals(output, wordsInArrays.swapGuy(words,index));
    }
}
