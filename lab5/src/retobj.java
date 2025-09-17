
class Rec {
    int length, breadth;

    Rec(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cir {
    double radius;

    Cir(double r) {
        radius = r;
    }
}

class Result {
    double area;

    Result(double a) {
        area = a;
    }

    void display(String shape) {
        System.out.println("Area of " + shape + ": " + area);
    }
}

class Calculator {

    Result area(Rec rect) {
        double a = rect.length * rect.breadth;
        return new Result(a);
    }

    Result area(Cir c) {
        double a = Math.PI * c.radius * c.radius;
        return new Result(a);
    }
}

public class retobj {
    public static void main(String[] args) {
        Rec r = new Rec(10, 5);
        Cir c = new Cir(7.0);

        Calculator calc = new Calculator();

        Result rectResult = calc.area(r);
        Result circleResult = calc.area(c);

        rectResult.display("Rectangle");
        circleResult.display("Circle");
    }
}
