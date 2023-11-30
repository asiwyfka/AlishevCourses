package lesson5;

public class Task1 {

    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2009);
        car.setColor("Blue");
        car.setModel("KIA");

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}
