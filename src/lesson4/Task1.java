package lesson4;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {
        int count8 = 0;
        int count1 = 0;
        int countChet = 0;
        int neCountChet = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (10 - 0 + 1) + 0));
            if (array[i] > 8)
                count8++;
            if (array[i] == 1)
                count1++;
            if (array[i] % 2 == 0)
                countChet++;
            if (array[i] % 2 != 0)
                neCountChet++;
            sum = sum + array[i];
        }
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равное 1: " + count1);
        System.out.println("Количество четных чисел: " + countChet);
        System.out.println("Количество нечетных чисел: " + neCountChet);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
