package lesson11;

public class Picker implements Worker {

    private int salary;
    private Warehouse warehouse;

    public Picker(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary = this.salary + 80;
        warehouse.setCountOrder((warehouse.getCountOrder()+1));
    }

    @Override
    public void bonus() {
        if (this.warehouse.getCountOrder() > 1500)
            this.salary = this.salary * 3;
    }
}
