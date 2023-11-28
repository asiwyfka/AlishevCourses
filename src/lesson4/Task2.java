package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int min = 1000;
        int max = 0;
        int countEnd0 = 0;
        int sumCountEnd0 = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (1000 - 0 + 1) + 0));
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
            if (array[i] % 10 == 0) {
                countEnd0++;
                sumCountEnd0 = sumCountEnd0 + array[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива оканчивающихся на 0: " + countEnd0);
        System.out.println("Сумма элементов массива оканчивающихся на 0: " + sumCountEnd0);
    }
}
