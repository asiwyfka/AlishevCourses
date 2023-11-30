package lesson9;

public class Triangle extends Figure{

    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB, int sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return Math.sqrt((((sideA+sideB+sideC)/2)-sideA)*(((sideA+sideB+sideC)/2)-sideB)*(((sideA+sideB+sideC)/2)-sideC)*(sideA+sideB+sideC)/2);
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }
}

