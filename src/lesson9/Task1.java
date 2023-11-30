package lesson9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Виктор","Группа по изучению программирования");
        Teacher teacher = new Teacher("Дмитрий","Программирование");

        System.out.println(student.getLearnGroup());
        System.out.println(teacher.getObject());
        student.printinfo();
        teacher.printinfo();


    }


}
