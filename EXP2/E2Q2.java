import java.util.*;
public class E2Q2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int prime = 0;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                prime = 1;
                break;
            }
        }
        if(prime==0){
            System.out.println("Yes, prime.");
        }
        else{
            System.out.println("No, not prime.");
        }
    }
}