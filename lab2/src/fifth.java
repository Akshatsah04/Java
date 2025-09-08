import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        double DA = 0.50 * basicPay;   // 50% of Basic
        double HRA = 0.20 * basicPay;  // 20% of Basic
        double PF = 0.14 * basicPay;   // 14% of Basic
        double grossPay = basicPay + DA + HRA - PF;

        System.out.println("\n----- Employee Payslip -----");
        System.out.println("Basic Pay     : " + basicPay);
        System.out.println("DA (50%)      : " + DA);
        System.out.println("HRA (20%)     : " + HRA);
        System.out.println("PF (14%)      : " + PF);
        System.out.println("-----------------------------");
        System.out.println("Gross Pay     : " + grossPay);
    }
}
