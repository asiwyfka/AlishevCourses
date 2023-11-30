package lesson9;

public class Human {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void printinfo() {
        System.out.println("Этот человек с именем " + this.name);
    }


}
