public class swapnumbersThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("a : " + a + " || b : " + b);

        a = c - a;
        b = c - b;

        System.out.println("a : " + a + " || b : " + b);
    }
}