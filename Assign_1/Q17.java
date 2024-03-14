public class Q17 {
    public static void main(String[] args){
        boolean prime;
        for(int x = 10; x<=99; x++){
            prime = true;
            for(int i = 2; i < x; i++){
                if(x % i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(x + " ");
            }
        }
    }
}
