import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        int x = scanner.nextInt();
        System.out.println("Enter the second value");
        int y = scanner.nextInt();
        System.out.println("Enter the third value");
        int z = scanner.nextInt();
        if (x>y){
            if (x>z) {
                System.out.println(x + " is the largest number");
            }else{
                System.out.println(z + " is the largest number");
            }
        }else{
            if(y>z){
                System.out.println(y + " is the largest number");
            }else{
                System.out.println(z + " is the largest number");
            }
        }
    }
}
