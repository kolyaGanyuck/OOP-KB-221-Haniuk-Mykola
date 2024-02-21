package lab01;

import java.util.Arrays;

public class Task14 {
    public static void cycleSwap(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            newArr[i] = array[i - 1];
        }
        newArr[0] = array[array.length - 1];
        System.out.println(Arrays.toString(newArr));
    }
    public static void cycleSwap(int[] array, int shift) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            if (array.length > i + shift) {
                newArr[i + shift] = array[i];
            }
            else {
                newArr[(i + shift) % array.length] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
