import java.util.*;
public class Grade {
    public static void main(String[] args){
        int marks[] = new int[5];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Enter marks : ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        if(total>400 && total<=500){
            System.out.println("Marks : " + total + " & Grade : O");
        }

        else if(total>300 && total<=400){
            System.out.println("Marks : " + total + " & Grade : E");
        }

        else if(total>250 && total<=300){
            System.out.println("Marks : " + total + " & Grade : A");
        }

        else if(total>=200 && total<=250){
            System.out.println("Marks : " + total + " & Grade : B");
        }

        else if(total>0 && total<=199){
            System.out.println("Marks : " + total + " & Grade : F");
        }
    }
}
