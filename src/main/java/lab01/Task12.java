package lab01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task12 {
    public static boolean[] getSumCheckArray(int [] arr){
        boolean[] output = new boolean[arr.length];
        output[0] = false;
        output[1] = false;
        if (arr.length > 2){
            for (int i = 2; i < arr.length; i++){
                output[i] = arr[i] == arr[i - 2] + arr[i - 1];
            }
        }
        return output;
    }
}
