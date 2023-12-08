package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        }
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        try {
            int[] numbers = new int[10];
            int counter = 0;
            for (String x : strings)
                numbers[counter++] = Integer.parseInt(x);
            System.out.println(Arrays.toString(numbers));

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println(sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл!");
            e.printStackTrace();
        }
    }
}