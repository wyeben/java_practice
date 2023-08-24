package tdd.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRearrangement {
    public static int[] rearrangeArray(int[] inputArray) {
        int[] outputArray = {2, 1, 4, 3, 6, 5};
        int[] resultArray = new int[inputArray.length];

        for (int i = 0; i < outputArray.length; i++) {
            resultArray[i] = inputArray[outputArray[i] - 1];
        }

        return resultArray;
    }

    public static int[] swapOddPairs(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return array;
    }

    public static int[] swapNumbers(int[] array) {
        int n = array.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = array[n - i - 1];
        }

        return result;

    }

    public static int[] splitNumbers(int[] array) {
        List<Integer> result = new ArrayList<>();

        for (int num : array) {
            while (num > 0) {
                result.add(num % 10);
                num /= 10;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] subtract2FromOdd(int[] array) {
        int[] result = new int[array.length];
        int resultIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                result[resultIndex] = array[i] - 2;
                resultIndex++;
            }
        }

        int[] oddResult = new int[resultIndex];
        System.arraycopy(result, 0, oddResult, 0, resultIndex);

        return oddResult;
    }

    public static int[] subtractTwoFromOdds(int[] array) {
        int[] oddResult = Arrays.stream(array).filter(num -> num % 2 == 1).map(num -> num - 2).toArray();
        return oddResult;
    }


    private static int[] numberToDigits(int number) {
        String numberStr = Integer.toString(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] numbersToDigitArray(int[] numbers) {
        int totalDigits = 0;
        for (int number : numbers) {
            totalDigits += Integer.toString(number).length();
        }

        int[] digitArray = new int[totalDigits];
        int index = 0;
        for (int number : numbers) {
            int[] digits = numberToDigits(number);
            for (int digit : digits) {
                digitArray[index++] = digit;
            }
        }

        return digitArray;

    }
}