import java.util.*;
public class BCalc {
    public static void main(String[] args) {
        System.out.print(
                "1. Add\n2. Substract\n3. Multiplication\n4. Division\n5. Modulus\n6. Square\n7. Square root\n8. Cube\n9. Cube root\n\nEnter choice : ");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter numbers : ");
                System.out.println("Addition is : " + (sc.nextInt() + sc.nextInt()));
                break;

            case 2:
                System.out.print("Enter numbers : ");
                System.out.println("Substraction is : " + (sc.nextInt() - sc.nextInt()));
                break;

            case 3:
                System.out.print("Enter numbers : ");
                System.out.println("Multiplication is : " + (sc.nextInt() * sc.nextInt()));
                break;

            case 4:
                System.out.print("Enter numbers : ");
                System.out.println("Division is : " + (sc.nextInt() / sc.nextInt()));
                break;

            case 5:
                System.out.print("Enter numbers : ");
                System.out.println("Modulus is : " + (sc.nextInt() % sc.nextInt()));
                break;

            case 6:
                System.out.print("Enter number : ");
                System.out.println("Square is : " + Math.pow(sc.nextInt(), 2));
                break;

            case 7:
                System.out.print("Enter number : ");
                System.out.println("Square root is : " + Math.sqrt(sc.nextInt()));
                break;

            case 8:
                System.out.print("Enter number : ");
                System.out.println("Cube is : " + Math.pow(sc.nextInt(),3));
                break;

            case 9:
                System.out.print("Enter number : ");
                System.out.println("Cube root is : " + Math.cbrt(sc.nextInt()));
                break;
        }
    }
}
