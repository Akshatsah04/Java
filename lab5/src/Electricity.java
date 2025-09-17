import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int prevReading;
    int currReading;
    String connectionType;

    ElectricityBill(int cNo, String cName) {
        consumerNo = cNo;
        consumerName = cName;
        prevReading = 0;
        currReading = 0;
        connectionType = "Domestic";
    }

    ElectricityBill(int cNo, String cName, int prev, int curr) {
        consumerNo = cNo;
        consumerName = cName;
        prevReading = prev;
        currReading = curr;
        connectionType = "Domestic";
    }

    ElectricityBill(int cNo, String cName, int prev, int curr, String type) {
        consumerNo = cNo;
        consumerName = cName;
        prevReading = prev;
        currReading = curr;
        connectionType = type;
    }

    double calculateBill() {
        int units = currReading - prevReading;
        double amount = 0;

        if (connectionType.equalsIgnoreCase("Domestic")) {
            if (units <= 100) amount = units * 1;
            else if (units <= 200) amount = 100 * 1 + (units - 100) * 2.5;
            else if (units <= 500) amount = 100 * 1 + 100 * 2.5 + (units - 200) * 4;
            else amount = 100 * 1 + 100 * 2.5 + 300 * 4 + (units - 500) * 6;
        } else { // Commercial
            if (units <= 100) amount = units * 2;
            else if (units <= 200) amount = 100 * 2 + (units - 100) * 4.5;
            else if (units <= 500) amount = 100 * 2 + 100 * 4.5 + (units - 200) * 6;
            else amount = 100 * 2 + 100 * 4.5 + 300 * 6 + (units - 500) * 7;
        }
        return amount;
    }

    // Method to display consumer details
    void display() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer No   : " + consumerNo);
        System.out.println("Consumer Name : " + consumerName);
        System.out.println("Connection    : " + connectionType);
        System.out.println("Previous Reading : " + prevReading);
        System.out.println("Current Reading  : " + currReading);
        System.out.println("Total Units      : " + (currReading - prevReading));
        System.out.println("Bill Amount      : Rs. " + calculateBill());
    }
}

public class Electricity {
    public static void main(String[] args) {
        ElectricityBill b1 = new ElectricityBill(101, "Akshat");
        b1.display();

        ElectricityBill b2 = new ElectricityBill(102, "Rohan", 120, 300);
        b2.display();

        ElectricityBill b3 = new ElectricityBill(103, "Rahul", 500, 900, "Commercial");
        b3.display();
    }
}
