package lesson9;

public class Student extends Human{

   private String learnGroup;

    public String getLearnGroup() {
        return learnGroup;
    }

    public void setLearnGroup(String learnGroup) {
        this.learnGroup = learnGroup;
    }

    public Student(String name, String learnGroup) {
        super(name);
        this.learnGroup = learnGroup;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("Этот студент с именем " + this.getName());
    }
}
