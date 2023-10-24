package americana.stringBuilder;

import java.util.ArrayList;

public class StringBuilderBen {

    public static String append(String letter) {
        String result = String.valueOf(new ArrayList<>());
        for (int i = 0; i < letter.length(); i++) {
            result+=letter.charAt(i);

        }
        return letter;
    }
}
