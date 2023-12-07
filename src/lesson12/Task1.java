package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mersedes");
        list.add("AUDI");
        list.add("Ford");
        list.add("Toyota");
        for (String x : list)
            System.out.println(x);
        list.add(3, "Chevrolet");
        list.remove(0);
        for (String x : list)
            System.out.println(x);
    }
}




