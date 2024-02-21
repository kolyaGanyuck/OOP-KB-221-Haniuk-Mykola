package lab01;

import java.util.Scanner;

public class Task2 {
    public static String timeCorrect() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int s = input % 60;
        input /= 60;
        int m = input % 60;
        input /= 60;
        int h = input % 24;
        scanner.close();
        return String.format("%02d:%02d:%02d", h, m, s);

    }
}
