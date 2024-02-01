import java.util.*;
public class E2Q3 {
    public static void main(String[] args) {
        int n, fact;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        fact = n;
        while(n>1){
            fact = fact * (n-1);
            n = n - 1;
        }

        System.out.print("Factorial : " + fact);
    }
}