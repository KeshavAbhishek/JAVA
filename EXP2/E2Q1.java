import java.util.*;
public class E2Q1{
    public static void main(String[] args) {
        int id;
        String name;
        float salary;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter emp ID : ");
            id = sc.nextInt();
            System.out.print("Enter emp name : ");
            name = sc.next();
            System.out.print("Enter emp salary : ");
            salary = sc.nextFloat();

            System.out.println("\nID : " + id + "\nName : " + name + "\nSalary : " + salary + "\n");
        }
    }
}