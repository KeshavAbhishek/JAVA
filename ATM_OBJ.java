import java.util.Scanner;

public class ATM_OBJ {
    public static int balance = 0;

    void deposit(int money){
        balance = balance + money;
        System.out.println("Credited : " + money);
    }

    void withdrawl(int money){
        if(balance < money){
            System.out.println("In-sufficient Balance.");
        }
        else{
            balance = balance - money;
            System.out.println("Debited : " + money);
        }
    }

    void balanceShow(){
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ATM_OBJ atm = new ATM_OBJ();

        int choice;
        int amt;
        boolean flag = true;
        while (flag == true) {
            System.out.print("1. Deposit money\n2. Withdrawl money\n3. Check balance\n\nEnter Choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount : ");
                    amt = sc.nextInt();
                    atm.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter amount : ");
                    amt = sc.nextInt();
                    atm.withdrawl(amt);
                    break;
                case 3:
                    atm.balanceShow();
                    break;
                default:
                    System.out.println("INVALID");
                    flag = false;
                    break;
            }
        }
    }
}
