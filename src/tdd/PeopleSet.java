package tdd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PeopleSet {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Benson");
        names.add("Yila");
        names.add("Americana");
        names.add("Benson");

        Set<String> uniqueNames = new HashSet<>(names);

        for (String name: uniqueNames){
            System.out.println(name);

        }
    }
}
