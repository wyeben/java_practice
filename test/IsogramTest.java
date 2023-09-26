import americana.Isogram;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramTest {
    @Test

    public void checkIsogram(){
        Isogram isogram = new Isogram();
        String name1 = "abcdefgh%&1Jklmnopqrstuvwxyz";
        String result = String.valueOf(Isogram.checkIsogram(name1));
        assertEquals("true",result);
    }
    @Test
    public void isNotIsogram(){
        Isogram isogram = new Isogram();
        String name1 = "abcdefghijkllnopqrstuvwxyz";
        String result = String.valueOf(Isogram.checkIsogram(name1));
        assertEquals("false",result);
    }
}
