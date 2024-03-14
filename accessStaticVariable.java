public class accessStaticVariable {
    public int balance = 5000;

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
        ATM_OBJ atm = new ATM_OBJ();
        atm.deposit(5000);
        atm.withdrawl(2000);
        atm.balanceShow();
        atm.withdrawl(7000);
        atm.balanceShow();
        atm.withdrawl(2000);
    }
}
