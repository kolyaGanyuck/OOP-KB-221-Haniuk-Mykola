package lab01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task7 {
    public static int maxFromInput(){
        ArrayList <Integer> arrayList = new ArrayList<>();
        while (true){
            System.out.print("Введіть послідовність цілих значень: ");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            arrayList.add(i);
            if (i == 0){
                scanner.close();
                return Collections.max(arrayList);
            }
        }
    }
}
