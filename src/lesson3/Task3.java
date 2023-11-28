package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            double delimoe = scanner.nextDouble();
            double delitel = scanner.nextDouble();
            if (delitel == 0)
                System.out.println("Делишь на 0!");
            if (delitel != 0) {
                double vicheslenie = delimoe / delitel;
                System.out.println(vicheslenie);
            }
        }
    }
}
