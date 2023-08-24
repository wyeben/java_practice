package tdd.classwork;

public class ArrayRearrangement3 {
    public static int[] OddPairs(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return array;
    }
}
