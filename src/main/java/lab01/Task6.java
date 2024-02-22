package lab01;

import java.util.Scanner;

public class Task6 {
    public static int divideBill() {
        System.out.print("Введіть суму та кількість друзів: ");
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int bill = Integer.parseInt(s[0]);
        int friends = Integer.parseInt(s[1]);
        if (bill < 0 || friends < 1) return 0;
        double pay = (double) bill / friends * 1.1;
        scanner.close();
        return (int) pay;
    }
}
