import java.util.*;

public class operation {

    public static void main(String[] args) {
        System.out.print("Operation\n\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Modulus\n\nEnter choice : ");

        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition : " + (sc.nextInt() + sc.nextInt()));
                    break;

                case 2:
                    System.out.println("Substraction : " + (sc.nextInt() - sc.nextInt()));
                    break;

                case 3:
                    System.out.println("Multiplication : " + (sc.nextInt() * sc.nextInt()));
                    break;

                case 4:
                    System.out.println("Multiplication : " + (sc.nextInt() / sc.nextInt()));
                    break;

                case 5:
                    System.out.println("Modulus : " + (sc.nextInt() % sc.nextInt()));
                    break;
                default:
                    break;
            }
        }

    }
}