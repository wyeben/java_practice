package tdd;

import americana.Person;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

public class PersonTest {
    Person person;

    @BeforeEach
     public void setup() {
        person = new Person();
    }

    @Test
    public void checkIfPersonExist(){
        assertNotNull(person);
    }

    @Test
    public void checkName(){
        person.setFirstName("Benson");
        assertEquals("Benson",person.getFirstName());


    }

}
