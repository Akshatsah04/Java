import java.util.Scanner;
class AreaCalculator {

    double area(int leng, int brea) {
        return leng * brea;
    }

    double area(double rad) {
        return Math.PI * rad * rad;
    }
}

public class Area {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length , breadth and radius");

        int length , breadth;
        double radius;

        length= sc.nextInt();
        breadth= sc.nextInt();
        radius= sc.nextDouble();




        System.out.println("Area of Rectangle: " + calc.area(length, breadth));
        System.out.println("Area of Circle: " + calc.area(radius));
    }
}
