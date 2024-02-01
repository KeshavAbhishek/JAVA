import java.util.*;
public class FindElement_1D_Array {
    public static void main(String[] args){
        int data[] = {3,2,1,4,5};
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Search : ");
        int search = sc.nextInt();
        sc.close();
        for (int i = 0; i < 5; i++) {
            if(search == data[i]){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.print("Value Not Found.");
        }
        else{
            System.out.print("Value Found.");
        }
    }
}
