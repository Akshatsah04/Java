import java.util.Scanner;
public class Point {
    double x , y;

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1 , Point p2){
        double dx = p2.x-p1.x;
        double dy = p2.y-p1.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first and second points(x1 , y1 ; x2 , y2) : ");
        int x1 =sc.nextInt();
        int y1 =sc.nextInt();
        int x2 =sc.nextInt();
        int y2 =sc.nextInt();

        Point p1 = new Point(x1 , y1);
        Point p2 = new Point(x2 , y2);

        System.out.println("distance: "+ distance(p1 , p2));

    }
}