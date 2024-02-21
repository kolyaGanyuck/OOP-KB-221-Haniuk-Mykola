package lab01;

import java.util.Scanner;

public class Task5 {
    public static String liftSnail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть змінну а: ");
        int up = scanner.nextInt();
        System.out.print("Введіть змінну b: ");
        int down = scanner.nextInt();
        System.out.print("Введіть змінну h: ");
        int high = scanner.nextInt();
        scanner.close();
        int diff = up - down;
        int days = (high - down + diff - 1) / diff;
        return String.valueOf(days);
    }
}

