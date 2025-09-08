import java.util.Scanner;

public class third {
    public static int findHCF(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int hcf = numbers[0];
        for(int i = 1; i < n; i++) {
            hcf = findHCF(hcf, numbers[i]);
        }
        System.out.println("HCF of the given numbers is: " + hcf);
    }
}
