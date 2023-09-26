package americana;

public class Isogram {

    public static boolean checkIsogram(String letters){
        if (letters == null || letters.isEmpty() || letters == " " || letters == "1,2,3,4,5,6,7,8,9") {
            return false;
        }
        boolean[] seen = new boolean[26];
        for (char letter : letters.toLowerCase().toCharArray()){
            if (letter >='a' && letter <='z'){
                int index = letter - 'a';
                if (seen[index]){
                    return false;

                }
                seen[index] = true;
            }
        }
        return true;
    }
}
