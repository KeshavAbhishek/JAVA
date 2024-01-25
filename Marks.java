import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.print("Enter marks of 5 subjects : ");
        int marks;
        
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();

        if(marks>400 && marks<=500){
            System.out.println("Marks : " + marks + " & Grade : O");
        }

        else if(marks>300 && marks<=400){
            System.out.println("Marks : " + marks + " & Grade : E");
        }

        else if(marks>250 && marks<=300){
            System.out.println("Marks : " + marks + " & Grade : A");
        }

        else if(marks>=200 && marks<=250){
            System.out.println("Marks : " + marks + " & Grade : B");
        }

        else if(marks>0 && marks<=199){
            System.out.println("Marks : " + marks + " & Grade : F");
        }
    }
}
