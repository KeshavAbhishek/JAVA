public class Q16 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);

        boolean prime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(num + " is prime.");
        }
        else{
            System.out.println(num + " is not prime.");
        }
    }
}
