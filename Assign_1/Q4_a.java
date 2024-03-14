import java.util.*;

public class Q4_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.nextLine();
        if(num!=0){
            if(num > 0){
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }
        else{
            System.out.println("Zero");
        }
    }
}