package americana.animal;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    Animal cow = new Animal();


    @Test

    public void canMakesound(){
        cow.setSound("bol");
        assertEquals("bol", cow.getSound());
    }

    @Test
    public void checkThatanimalCanRun(){
        cow.setRun("is running");
        assertEquals("is running", cow.getRun());
    }

}