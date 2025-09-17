import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array: ");
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize++] = arr[i];
            }
        }

        // Print result
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
