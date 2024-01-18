import java.util.*;
public class multiplyFloat {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            float a = sc.nextFloat();
            System.out.print("Enter b : ");
            float b = sc.nextFloat();
            System.out.println("Multiplication : " + (a*b));
        }
    }
}
