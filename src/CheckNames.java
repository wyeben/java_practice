import java.util.Arrays;

public class CheckNames {

    public String styleName(String inputName) {
        String[] split = splitName(inputName);
        String styled = "";
        for (int index = 0; index <= 2; index++) {
            String element = split[index];
            if (index < 2){
                char firstChar = getFirstCharacter(element);
                styled += firstChar;
            }
            else styled += ", "+ element;
        }
        return styled;
    }

    private char getFirstCharacter(String element) {
        return element.charAt(0);
    }

    private String[] splitName(String inputName) {
        return inputName.split(", ");
    }

    public String calculatateNumnerInString(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char s = input.charAt(i);
            if (Character.isDigit(s)){
                int number = Character.getNumericValue(s);
                sum += number;
            }
        }
        return Integer.toString(sum);
    }

}

