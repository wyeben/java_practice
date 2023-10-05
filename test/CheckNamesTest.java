import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNamesTest {
    @Test
    public void canStyleName(){
        CheckNames checkNames = new CheckNames();
        String inputName = "Yila, Benson, Americana";
        String check = checkNames.styleName(inputName);
        String outputName = "YB, Americana";
        assertEquals(outputName, check);

    }

    @Test
    public void canCheckNumbersInChar(){
        CheckNames countNumber = new CheckNames();
        String input = "A12BCKdt59";
        String check = countNumber.calculatateNumnerInString(input);
        String output = "17";
        assertEquals(output, check);
    }
}
