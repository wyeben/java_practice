package americana;

public class SwapArray {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 6, 10, 9, 3};
        swapNumber(numbers);
    }
    public static void swapNumber(int[] n){
        int[] arr = {5, 2, 6, 10, 9, 3};
        int i =2;
        int j =4;

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
