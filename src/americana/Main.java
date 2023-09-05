package americana;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};
        swapNumbers(ar);


    }
    public static void swapNumbers(int[] tr){
       int temp = tr[0];
       tr[0] = tr[1]=0;
       tr[1] = tr[2];
       tr[2] += tr[3];
       tr[3] = tr[4]=0;
       tr[4] = temp;
        System.out.println(Arrays.toString(tr));
    }
}
