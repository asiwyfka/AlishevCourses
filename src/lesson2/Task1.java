package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int floors = scanner.nextInt();

        if ((1 <= floors) & (floors <= 4))
            System.out.println("Малоэтажный дом");
        if ((5 <= floors) & (floors <= 8))
            System.out.println("Среднеэтажный дом");
        if (9 <= floors)
            System.out.println("Многоэтажный дом");
        if (0 >= floors)
            System.out.println("Ошибка ввода");
    }
}
