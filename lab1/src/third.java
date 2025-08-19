import java.util.Scanner;

public class third {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 2 ; i<=n ; i++){
            if( i%2 ==0 && i%3 ==0){
                sum+=i;
            }
        }
        System.out.println("sum of  all the even numbers divisible by 3 is " + sum);
    }
}
