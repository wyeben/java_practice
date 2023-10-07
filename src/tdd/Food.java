package tdd;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private double price;
    public List <String> category;

    public String addFood(String food, int price){
        category = new ArrayList<>();
        category.add(String.valueOf(price));
        return category.toString();
    }
}
