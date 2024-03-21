import java.util.Scanner;

interface MUL{
    public void mul(int a, int b);
    public void mul(int a, int b, int c);
    public void mul(int[] values, int nItem);
}

class multiplication implements MUL{
    public void mul(int a, int b){
        System.out.println("Method for Two numbers called- (Result) - " + a*b);
    }

    public void mul(int a, int b, int c){
        System.out.println("Method for Three numbers called- (Result) - " + a*b*c);
    }

    public void mul(int[] values, int nItem){
        int a = 1;
        for(int i = 0; i<nItem; i++){
            a = a*values[i];
        }
        System.out.println("Method for Multiple numbers called- (Result) - " + a);
    }
}

class E6Q2{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int n = 100;
        int[] values = new int[n];
        int x = 0;
        int nItem = 0;

        while(t){
            System.out.print("Enter the number (Press * to stop): ");
            String data = sc.next();

            if(data.equals("*")){
                t = false;
            }
            else{
                values[x] = Integer.parseInt(data);
                x++;
                nItem+=1;
            }
        }

        multiplication user = new multiplication();
        if(nItem == 2){
            user.mul(values[0], values[1]);
        }

        if(nItem == 3){
            user.mul(values[0], values[1], values[2]);
        }

        if(nItem > 3){
            user.mul(values, nItem);
        }
    }
}