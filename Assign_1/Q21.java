import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] array = {5,10,15,17};
        System.out.print("Enter number to be searched : ");
        int num = sc.nextInt();
        for(int i = 0; i<array.length; i++){
            if(array[i] == num){
                index = i;
                break;
            }
            else{
                index = -1;
            }
        }
        System.out.print(index);
    }
}
