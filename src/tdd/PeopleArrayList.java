package tdd;

import java.util.ArrayList;
import java.util.List;

public class PeopleArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Benson");
        names.add("Yila");
        names.add("Americana");

        String middleName = names.get(1);
        System.out.println("middle name is: "+ middleName);

        boolean check = names.contains("Yila");
        System.out.println("List contain Yila: " + check);

        System.out.println();
        for(String name: names){
            System.out.println(name);
        }
    }
}
