package lesson6;


public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2008);
        Motorbike motorbike = new Motorbike(2000, "Green", "URAL");

        System.out.println(car.yearDifference(2023));
        System.out.println(motorbike.yearDifference(2023));
    }
}
