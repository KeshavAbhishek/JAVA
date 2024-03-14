import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        int[] a = {10,1,7,3,2,15,88,4,6,8};

        Arrays.sort(a);
        for (int i : a){
            System.out.print(i + ", ");
        }
    }
}
