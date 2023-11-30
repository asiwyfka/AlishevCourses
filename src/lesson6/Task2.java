package lesson6;

public class Task2 {

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1995, 75, 150);
        airplane.info();
        airplane.fillUp(1000);
        airplane.info();
        airplane.setProducer("Tupolev");
        airplane.setLength(150);
        airplane.fillUp(1000);
        airplane.info();


    }
}
