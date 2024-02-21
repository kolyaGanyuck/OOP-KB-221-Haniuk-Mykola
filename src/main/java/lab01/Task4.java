package lab01;

import java.util.Scanner;

public class Task4 {
    public static void helloStranger(){
        System.out.print("Кількість незнайомців: ");
        Scanner scanner = new Scanner(System.in);
        int strangerQuantity = scanner.nextInt();
        scanner.nextLine();
        if (strangerQuantity > 0){
            while (strangerQuantity > 0){
                System.out.print("Введіть ім'я: ");
                String name = scanner.nextLine();
                System.out.println("Hello " + name);
                strangerQuantity--;
            }
            System.out.println("END");
        }
        else System.out.println("Кількість незнайомців < 1");
        scanner.close();
    }
}
