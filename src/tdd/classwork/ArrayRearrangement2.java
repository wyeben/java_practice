package tdd.classwork;

public class ArrayRearrangement2 {
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
                swap(array, i, i + 1);
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = array[n - i - 1];
        }

        return result;
    }
}
