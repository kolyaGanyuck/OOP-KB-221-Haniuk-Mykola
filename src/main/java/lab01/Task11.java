package lab01;

import java.util.Arrays;

public class Task11 {
    public static int sumFromArr(int[] arr){
        return Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
    }
}
