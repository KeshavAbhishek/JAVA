import java.util.*;

public class swapNumbers {
    public static void main(String[] args) {

        int a;
        int b;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number a : ");
            a = sc.nextInt();
            System.out.print("Enter number b : ");
            b = sc.nextInt();
        }
        System.out.println("Before : "+a+" "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After : "+a+" "+b);
    }
}
