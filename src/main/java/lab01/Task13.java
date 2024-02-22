package lab01;

import java.util.ArrayList;

public class Task13 {
    public static int[] removeLocalMaxima(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (arr.length < 3) return arr;
        if (arr[0] <= arr[1]) {
            arrayList.add(arr[0]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                continue;
            }
            arrayList.add(arr[i]);
        }
        if (arr[arr.length - 1] <= arr[arr.length - 2]) {
            arrayList.add(arr[arr.length - 1]);
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
