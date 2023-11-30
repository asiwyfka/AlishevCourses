package lesson7;

import lesson6.Airplane;

public class Task1 {
    public static void main(String[] args) {

        lesson7.Airplane airplane1 = new lesson7.Airplane("Boeing", 1995, 75, 150);
        lesson7.Airplane airplane2 = new lesson7.Airplane("Tu", 1995, 150, 150);

        lesson7.Airplane.compareAirplanes(airplane1, airplane2);


    }
}
