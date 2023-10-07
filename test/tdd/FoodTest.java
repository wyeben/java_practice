package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {
    @Test
    public void canBuyFood(){
        Food rice = new Food();
        Food beans = new Food();
        String checkPrice = rice.addFood(String.valueOf(beans),10);
        assertEquals("beans",checkPrice);
    }
}
