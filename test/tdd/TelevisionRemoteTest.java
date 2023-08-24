package tdd;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TelevisionRemoteTest {

    private TelevisionRemote tvr;

    @BeforeEach
    public void setup(){
        tvr = new TelevisionRemote();
    }

    @Test
    public void canCheck(){
        assertNotNull(tvr);
    }

}
