package lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Task10 {
    public static int maxFromArr(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
