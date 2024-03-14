import java.util.Scanner;
public class Q18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0, copy = num;

        while(num!=0){
            sum += num%10;
            num = num/10;
        }

        System.out.print("Sum of digits of " + copy + " is : " + sum);
    }
}
