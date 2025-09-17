// Rectangle class
class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

// Circle class
class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }
}

// Area calculator with overloaded methods
class Area_Calculator {

    double area(Rectangle rect) {
        return rect.length * rect.breadth;
    }

    double area(Circle c) {
        return Math.PI * c.radius * c.radius;
    }
}

public class objpass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(7.0);

        Area_Calculator calc = new Area_Calculator();

        System.out.println("Area of Rectangle: " + calc.area(r));
        System.out.println("Area of Circle: " + calc.area(c));
    }
}
