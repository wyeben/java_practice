import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialArraysTest {

    @Test
    public void checkThatCanSwapArrays(){
        SpecialArrays specialArrays = new SpecialArrays();
        int[] number = {1,2,4,5,6,7,8,9,10};
        int[] expected = {10,9,8,7,6,5,4,2,1};
        int[] check = specialArrays.swapIt(number);
        assertArrayEquals(expected, check);
    }

    @Test
    public void canReturnNumberWithoutDuplicate(){
        SpecialArrays specialArrays = new SpecialArrays();
        int[] input = {2,2,1};
        int[] output = {1};
        int[] check = specialArrays.returnNumberThatIsNotDuplicated(input);
        assertArrayEquals(output,check);
    }

    @Test
    public void canReturnNumberWithoutDuplicate2(){
        SpecialArrays specialArrays = new SpecialArrays();
        int[] input = {4,3,2,2,3,3};
        int[] output = {4};
        int[] check = specialArrays.returnNumberThatIsNotDuplicated(input);
        assertArrayEquals(output,check);
    }
}
