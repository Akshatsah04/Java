import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter " + (rows - 1) * cols + " integers for a 5x4 matrix:");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows - 1; i++) {
                sum += matrix[i][j];
            }
            matrix[rows - 1][j] = sum;
        }

        System.out.println("\nMatrix with column sums in the last row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
