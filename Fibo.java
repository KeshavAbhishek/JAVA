public class Fibo {
    public static void main(String[] args){
        int a = 0, b = 1, temp;
        for(int x = 0; x < 20 ; x++){
            System.out.print(a+" ");
            temp = a+b;
            a = b;
            b = temp;
        }
    }
}
