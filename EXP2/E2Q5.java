public class E2Q5 {
    
    public static void fibo(int num, int a, int b){
        if(num > 0){
            System.out.print(a + " ");
            fibo(num-1, b, a+b);
        }
    }
    public static void main(String[] args){
        int n = 5;
        // Recurssive Function
        System.out.print("\nRecurssive call : ");
        fibo(n, 0, 1);

        System.out.print("\n\nNon-recurssive call : ");

        int a = 0, b = 1;
        int temp;
        while(n > 0){
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
            n = n - 1;
        }
    }
}
