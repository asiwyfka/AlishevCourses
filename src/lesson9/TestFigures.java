package lesson9;


class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double perimetr = 0;
        for (Figure x : figures) {
            if (x.getColor().equals("Red")) {
                perimetr = perimetr + x.perimeter();
            }
        }
        return perimetr;
    }

    public static double calculateRedArea(Figure[] figures) {
        double area = 0;
        for (Figure x : figures) {
            if (x.getColor().equals("Red")) {
                area = area + x.area();
            }
        }
        return area;
    }
}
