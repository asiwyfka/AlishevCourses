package lesson6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Василий Петрович", "Математика");
        Student student = new Student("Витя");
        teacher.evaluate(student);

    }
}
