package lab01;

import java.util.Scanner;

public class Task1 {
    public static String hello(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        return "Hello " + s;
    }
}
