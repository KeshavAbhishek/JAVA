import java.util.*;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num1=0, num2=0;
        System.out.println(
                "\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Square\n7.Root\n8.Cube Root");
        System.out.print("\nEnter Choice: ");
        choice = sc.nextInt();
        if (choice == 6 || choice == 7 || choice == 8) {
            System.out.println("Enter a Number: ");
            num1 = sc.nextInt();
        } else if (choice >= 1 && choice <= 5) {
            System.out.println("Enter Two Numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        } else {
            System.out.println("Invalid Input!!");
        }
        switch (choice) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                float a = num1 / num2;
                System.out.println(a);
                break;
            case 5:
                System.out.println(num1 % num2);
                break;
            case 6:
                System.out.println(num1 * num1);
                break;
            case 7:
                System.out.println(Math.sqrt(num1));
                break;
            case 8:
                System.out.println(Math.cbrt(num1));
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
}