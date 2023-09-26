import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecialArrays {

    public int[] swapIt(int[] number) {
        int maxindex = number.length-1;
        int halfindex = number.length /2;
        for (int i = 0; i < halfindex;i++){
            int temp = number[i];
            number[i] = number[maxindex-i];
            number[maxindex-i] = temp;

        }
        return number;
    }

    public int[] returnNumberThatIsNotDuplicated(int[] input) {
            if (input.length == 0) {
                throw new IllegalArgumentException("The array is empty.");
            }

            Map<Integer, Integer> countMap = new HashMap<>();

            for (int num : input) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            List<Integer> uniqueList = new ArrayList<>();

            for (int num : input) {
                if (countMap.get(num) == 1) {
                    uniqueList.add(num);
                }
            }
            int[] uniqueNumbers = new int[uniqueList.size()];
            for (int i = 0; i < uniqueList.size(); i++) {
                uniqueNumbers[i] = uniqueList.get(i);
            }

            return uniqueNumbers;
        }
    }

