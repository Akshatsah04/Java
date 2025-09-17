import java.util.Scanner;

class PerAccount {
    String depositorName;
    String accountType;
    int accountNumber;
    double balance;

    PerAccount() {
        depositorName = "Unknown";
        accountType = "Savings";
        accountNumber = 0;
        balance = 0.0;
    }

    PerAccount(String name, String type, int accNo, double initialBalance) {
        depositorName = name;
        accountType = type;
        accountNumber = accNo;
        balance = initialBalance;
    }

    PerAccount(PerAccount acc) {
        depositorName = acc.depositorName;
        accountType = acc.accountType;
        accountNumber = acc.accountNumber;
        balance = acc.balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------------");
    }
}

public class Acccon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PerAccount acc1 = new PerAccount();
        System.out.println("Account created using Default Constructor:");
        acc1.display();

        PerAccount acc2 = new PerAccount("Akshat Kumar", "Savings", 123456, 5000.0);
        System.out.println("Account created using Parameterized Constructor:");
        acc2.display();

        acc2.deposit(1500.0);
        acc2.withdraw(2000.0);
        acc2.display();

        PerAccount acc3 = new PerAccount(acc2);
        System.out.println("Account created using Copy Constructor (copy of acc2):");
        acc3.display();

        sc.close();
    }
}
