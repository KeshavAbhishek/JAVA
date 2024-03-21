import java.util.Scanner;

interface BoxTravelCost{
    void kmenter();
    void kmprice();
}

class Box implements BoxTravelCost{
    int depth = 0, length = 0, breadth = 0, km = 0;
    float costperkm = 0.0f;
    Scanner sc = new Scanner(System.in);

    public void kmenter(){
        System.out.println();
        System.out.print("Enter km to travel : ");
        km = sc.nextInt();
    }
    public void kmprice(){
        System.out.println();
        System.out.print("Enter per km price : ");
        costperkm = sc.nextFloat();
    }

    Box(){
        System.out.print("Enter depth, length and breadth : ");
        depth = sc.nextInt();
        length = sc.nextInt();
        breadth = sc.nextInt();
        kmenter();
        kmprice();
    }
}


class Boxweight extends Box{
    void totalCost(){
        System.out.println("Total Cost : " + (km * (length*breadth*depth)*costperkm));
    }
}
public class E6Q1 {
    public static void main(String[] args) {
        Boxweight bxwgt = new Boxweight();
        bxwgt.totalCost();
    }
}