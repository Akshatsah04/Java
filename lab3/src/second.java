import java.util.Scanner;

public class second {
    public static void main(String[] args){
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of student in 5 subjects");
        int max = 0;
        int avg = 0;
        for (int i = 0 ; i<5 ; i++){
            marks[i] = sc.nextInt();
            if (marks[i]>max){
                max = marks[i];
            }
            avg+=marks[i];
        }
        System.out.println("Highest mark secured by a student is "+ max);
        System.out.println("Average mark secured by a student is "+ avg/5);
    }
}
