import java.util.*;
public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int numCopy = num;
        int revNum = 0;
        sc.nextLine();

        while(num != 0){
            revNum = revNum * 10 + (num%10);
            num = num/10;
        }

        System.out.println(numCopy + " reverse to " + revNum);
    }
}
