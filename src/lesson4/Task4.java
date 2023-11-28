package lesson4;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int index = 0;

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (10000 - 0 + 1) + 0));
            if ((i != 0) & (i < array.length-1)) {
                sum = array[i - 1] + array[i] + array[i + 1];
                if (sum > max) {
                    max = sum;
                    index = i - 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
