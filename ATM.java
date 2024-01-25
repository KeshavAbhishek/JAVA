import java.util.*;

public class ATM {
    public static void main(String[] args) {
        int balance = 10000;
        int choice;
        int money;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nATM\n1. Credit\n2. Debit\n\nEnter choice : ");
        choice = sc.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.print("Enter amount : ");
                money = sc.nextInt();
                balance = balance + money;
                System.out.println("Balance Credited.\n" + "Remaning balance : " + balance);
            }
            if (choice == 2) {
                System.out.print("Enter amount : ");
                money = sc.nextInt();
                if (money > balance) {
                    System.out.println("Transcation Denied. Insufficient balance.");
                } else {
                    balance = balance - money;
                    System.out.println("Balance Debited.\nRemaning balance : " + balance);
                }
            }
            System.out.print("\n\nATM\n1. Credit\n2. Debit\n\nEnter choice : ");
            choice = sc.nextInt();
        }
    }
}