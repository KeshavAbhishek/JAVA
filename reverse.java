public class reverse {
    public static void main(String[] args){
        int x = 1024;
        int copy = x;
        int rev = 0;
        while(x>0){
            // System.out.print(x%10);
            rev = rev*10 + (x%10);
            x = x/10;
        }
        System.out.println("Original : " + copy);
        System.out.println("Reversed : " + rev);
    }
}
