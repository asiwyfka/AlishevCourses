package lesson11;

public class Courier implements Worker {

    private int salary;
    private Warehouse warehouse;

    public Courier(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary = this.salary + 100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {
        if (this.warehouse.getBalance() > 1_000_000)
            this.salary = this.salary * 2;
    }
}

