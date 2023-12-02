package lesson11;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(0, warehouse1);
        Picker picker1 = new Picker(0, warehouse1);


        for (int i = 1; i <= 1500; i++) {

            courier1.doWork();
            picker1.doWork();

            System.out.println(warehouse1.toString());
            System.out.println("ЗП курьера: " + courier1.getSalary());
            System.out.println("ЗП кладовщика: " + picker1.getSalary());
        }

        courier1.bonus();
        picker1.bonus();

        System.out.println("ЗП курьера: " + courier1.getSalary());
        System.out.println("ЗП кладовщика: " + picker1.getSalary());

    }
}
