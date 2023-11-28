package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            double delimoe = scanner.nextDouble();
            double delitel = scanner.nextDouble();
            if (delitel == 0){
                System.out.println("Делишь на 0!");
                break;}
            double vicheslenie = delimoe / delitel;
            System.out.println(vicheslenie);
        }
    }
}
