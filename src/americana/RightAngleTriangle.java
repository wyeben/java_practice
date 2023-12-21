package americana;

public class RightAngleTriangle {
    public static void main(String[] args) {
//        int rows1 = 5;
//        for (int i = 1; i <= rows1; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//        }
        int rows = 5;

        for (int j = rows; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}
