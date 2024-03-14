public class Q19{
    public static void main(String[] args) {
        int[] array = {5,10,15,17};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + sum/(float)array.length);
    }
}