import java.util.Scanner;

class Box{
    int depth, length, breadth, km;
    float costperkm;
    Scanner sc = new Scanner(System.in);
    Box(){
        System.out.print("Enter depth, length and breadth : ");
        depth = sc.nextInt();
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    int volume(){
        return depth * length * breadth;
    }
}

public class Q30 {
    public static void main(String[] args) {
        Box obj = new Box();
        System.out.println("Volume : " + obj.volume());
    }
}