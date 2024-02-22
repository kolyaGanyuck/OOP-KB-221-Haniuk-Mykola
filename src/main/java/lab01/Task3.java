package lab01;

import java.util.Scanner;

public class Task3 {
    final static int PASSWORD = 7777;
    public static String helloAgent() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        if (input == PASSWORD) return "Hello, Agent";
        else return "Access denied";
    }
}
