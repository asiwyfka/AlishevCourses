package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        Scanner scanner = null;
        List<String> listOfPeople = null;
        try {
            listOfPeople = new ArrayList<>();
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                listOfPeople.add(line);
            }
            return listOfPeople;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл!");
            e.printStackTrace();
        }
        return null;
    }
}
