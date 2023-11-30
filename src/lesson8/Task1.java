package lesson8;

public class Task1 {
    public static void main(String[] args) {

        String string1 = null;
        long startTime1 = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            string1 = string1 + " " + i;
        }
        long endTime1 = System.nanoTime();
        System.out.println(string1);
        long elapsedTime1 = endTime1 - startTime1;


        StringBuilder string2 = new StringBuilder();

        long startTime2 = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            string2.append(" ").append(i);
        }
        long endTime2 = System.nanoTime();
        System.out.println(string2);
        long elapsedTime2 = endTime2 - startTime2;

        System.out.println(elapsedTime1);
        System.out.println(elapsedTime2);
    }

}
