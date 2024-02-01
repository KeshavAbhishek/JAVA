public class E2Q6 {
    public static void main(String[] args){
        int n = 1;
        for(int i = 0; i < 7; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(n + " ");
                n = n + 1;
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}