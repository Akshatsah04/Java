import java.util.Scanner;

public class fourth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        int count = 0;
        int temp = num;
        int temp2 = num;
        while (temp>0){
            count++;
            temp/=10;
        }
        double sum =0;
        while (temp2>0){
            int dig = temp2%10 ;
            sum += Math.pow(dig , count);
            temp2/=10;
        }
        if(num == sum){
            System.out.println(num + " is an armstrong number");
        }else{
            System.out.println(num +" is not an armstrong number");
        }



    }
}
