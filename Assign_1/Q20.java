public class Q20{
    public static void main(String[] args) {
        int[] array = {5,10,15,17};
        int max, min;
        max = min = array[0];

        for (int j : array) {
            if (j > max) {
                max = j;
            } else {
                min = j;
            }
        }

        System.out.print("Max : " + max + "\nMin : " + min);
    }
}