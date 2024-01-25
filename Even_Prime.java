public class Even_Prime {
    public static void main(String[] args) {
        for(int i = 1; i < 20; i++){
            int flag = 0;
            if(i % 2 == 0){
                for(int j = 2; j<=i-1; j++){
                    if(i%j==0){
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println();
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
}