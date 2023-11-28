package lesson4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int index = 0;
        int sum = 0;
        int max = 0;
        int[][] array = new int[12][8];
        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                array[m][n] = (int) ((Math.random() * (50 - 0 + 1) + 0));
                if (n < array[m].length) {
                    sum = sum + array[m][n];
                    System.out.println("Суммируем :" + array[m][n]);
                }
            }
            System.out.println("Прошли строку: " + (m + 1));
            System.out.println("Её сумма равна : " + sum);
            if (sum > max) {
                max = sum;
                index = m;
                sum = 0;
            } else {
                sum = 0;
            }
        }

        for (int[] a : array)
            System.out.println(Arrays.toString(a));
        System.out.println("Сумма чисел максимальнf в строке: " + (index + 1));
        System.out.println("Сумма чисел в этой строке равна: " + max);
    }
}
