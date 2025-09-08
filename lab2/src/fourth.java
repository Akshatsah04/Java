import java.util.Scanner;
public class fourth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        for(int i=0 ;  i<n ; i++){
            int j;
            for(j=1 ; j<=i+1 ; j++){
                System.out.print(j + " ");
            }
            j-=2;
            for(int k=j ; k>0 ; k--){
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
