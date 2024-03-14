public class Q4_b {
    public void lastDigit(int a, int b){
        if(a%10==b%10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args){
        Q4_b obj = new Q4_b();
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        obj.lastDigit(a, b);
    }
}