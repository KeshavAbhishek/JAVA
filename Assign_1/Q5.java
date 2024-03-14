import java.util.*;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.nextLine();

        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}