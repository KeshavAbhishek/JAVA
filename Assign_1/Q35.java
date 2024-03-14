import java.util.Scanner;

class Fruit{
    String name, taste;
    int size;

    void eat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();

        System.out.print("Enter taste : ");
        taste = sc.nextLine();
    }
} 

class Orange extends Fruit{
    @Override
    void eat(){
        
    }
}


public class Q35 {
    
}
