public class SumOfDigits {
    public static void main(String[] args){
        int sum = 0;
        int num = 125;
        while(num>0){
            sum = sum + (num%10);
            num = num/10;
        }

        System.out.println("Sum of digits : " + sum);
    }
}
