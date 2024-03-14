public class Q24 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 2, 1, 2, 6};
        int[] b = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (b[j] == a[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                b[index++] = a[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(b[i]);
        }
    }
}