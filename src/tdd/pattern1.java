package tdd;

public class pattern1 {
    public static void main(String[] args) {
        createPattern(5);
        createPattern2(5);
        createPattern3(5);
        createPattern4(5);
        createPattern5(5);
        createPattern6(5);

    }

    public static void createPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void createPattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void createPattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void createPattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void createPattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalcol = row > n ? 2 * n - row: row;
            for (int col = 1; col < totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void createPattern6(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalcol = row > n ? 2 * n - row: row;

            int numOfSpaces = n - totalcol;
            for (int i = 0; i < numOfSpaces; i++) {
                System.out.print(" ");

            }
            for (int col = 1; col < totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}