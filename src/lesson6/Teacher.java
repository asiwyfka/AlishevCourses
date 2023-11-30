package lesson6;

public class Teacher {

    private String name;
    private String object;


    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    void evaluate(Student student) {
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.object + " на оценку " + grade());
    }

    String grade() {
        int value = (int) (Math.random() * (5 - 2 + 1) + 2);
        if (value==2)
            return "Неуд";
        else if (value==3)
            return "Уд";
        else if (value==4)
            return "Хор";
        else return "Отл";
    }
}
