import java.util.Scanner;
class E8Q1{
    void TUC(String str){
        System.out.println(str + " to uppercase " + str.toUpperCase());
    }

    void TLC(String str){
        System.out.println(str + " to lowercase " + str.toLowerCase());
    }

    void RS(String str){
        System.out.println(str + " without space " + str.replace(" ",""));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        E8Q1 user = new E8Q1();
        String temp;
        System.out.println("Enter a String : ");
        temp = sc.nextLine();
        user.TUC(temp);

        System.out.println("Enter a String : ");
        temp = sc.nextLine();
        user.TLC(temp);

        System.out.println("Enter a String : ");
        temp = sc.nextLine();
        user.RS(temp);
    }
}