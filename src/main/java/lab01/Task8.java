package lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task8 {
    public static int maxFromAverage() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {
            System.out.print("Введіть значення: ");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i != 0) arrayList.add(i);
            else  {
                scanner.close();
                return (int) arrayList.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
            }
        }
    }
}
