public class Q25 {
    public static void main(String[] args) {
        int[] a = {6,1,2,3,4,5,7,10};
        int sum = 0;
        boolean allowSum = true;
        int i = 0;
        while(i < a.length){

            if(a[i] == 6){
                allowSum = false;
            }else if(a[i] == 7){
                allowSum = true;
                i = i+1;
            }

            if(allowSum) {
                sum += a[i];
            }

            i++;
        }
        System.out.println(sum);
    }
}