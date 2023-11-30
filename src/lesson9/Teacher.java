package lesson9;

public class Teacher extends Human {

    private String Object;

    public Teacher(String name, String object) {
        super(name);
        Object = object;
    }

    public String getObject() {
        return Object;
    }

    public void setObject(String object) {
        Object = object;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("Этот преподаватель с именем " + this.getName());
    }
}
