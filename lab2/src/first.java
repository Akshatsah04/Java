import java.util.Scanner;
public class first {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();
        int sum = 0;
        while(num>0){
            int dig =num%10;
            sum+=dig;
            num/=10;
        }
        System.out.println("the sum of the digits of this number is "+ sum);
    }
}
