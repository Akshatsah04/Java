import java.util.Scanner;

class Account {
    String depositorName;
    String accountType;
    int accountNumber;
    double balance;

    void assignValues(String name, String type, int accNo, double initialBalance) {
        depositorName = name;
        accountType = type;
        accountNumber = accNo;
        balance = initialBalance;
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
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        account.assignValues("Akshat Kumar", "Savings", 123456, 5000.0);
        account.display();
        account.deposit(1500.0);
        account.withdraw(2000.0);
        account.display();
        sc.close();
    }
}
