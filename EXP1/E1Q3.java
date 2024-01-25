class E1Q3 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40, temp;
        System.out.println("Without temp variable :");
        System.out.println("Before Swap : " + a + " " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap : " + a + " " + b);

        System.out.println("\nWith temp variable :");
        System.out.println("Before Swap : " + c + " " + d);
        temp = c;
        c = d;
        d = temp;
        System.out.println("After Swap : " + c + " " + d);
    }
}
