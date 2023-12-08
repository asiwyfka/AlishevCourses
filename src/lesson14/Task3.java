package lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file).toString());
    }
    public static List<Person> parseFileToObjList(File file) {
        Scanner scanner = null;
        List<Person> listOfPeople = null;
        try {
            listOfPeople = new ArrayList<>();
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                listOfPeople.add(new Person(person[0], Integer.parseInt(person[1])));
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
