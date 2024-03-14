import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int[] a = {10,1,7,3,2,15,88,4,6,8};

        Arrays.sort(a);
        System.out.println("1st Smallest : " + a[0]);
        System.out.println("2nd Smallest : " + a[1]);
        System.out.println("1st Largest : " + a[a.length-1]);
        System.out.println("2nd Largest : " + a[a.length-2]);
    }
}