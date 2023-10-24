package americana.stringBuilder;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringBuilderTest {

@Test
    public void canAppend(){
    StringBuilderBen stringBuilderBen = new StringBuilderBen();
        String name = "";
        String letter = "ben";
        String result = name.append(letter);
        assertEquals("ben",result);
}
    @Test
    public void canDelete(){

    }
    @Test
    public void canInsert(){

    }

}