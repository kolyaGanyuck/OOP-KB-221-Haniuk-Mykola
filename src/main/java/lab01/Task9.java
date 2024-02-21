package lab01;

import java.util.Scanner;

public class Task9 {
    public static String discriminant(){
        System.out.print("Введіть значення a,b,c: ");
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        scanner.close();
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) return "no roots";
        if (discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "root1 = " + root1 +
            "\nroot2 = " + root2;
        }
        else return String.valueOf( -b / (2 * a));
    }

}
