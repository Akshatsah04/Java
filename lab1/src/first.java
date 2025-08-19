import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int rad = scanner.nextInt();

        double peri = 2*Math.PI*rad;
        System.out.println("the perimeter of the circle is "+ peri);

        double area = Math.PI*rad*rad;
        System.out.println("the area of the circle "+ area);

        scanner.close();
    }
}
