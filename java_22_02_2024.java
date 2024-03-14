class Inheritance1{
    int a = 50;
    int b = 60;
    public void display(){
        System.out.println((a + b));
    }
}

class Inheritance2 extends Inheritance1{
    int c = 30;
    int d = 40;
    public void display(){
        super.display();
        System.out.println((c + d));
    }
}

public class java_22_02_2024 {
    public static void main(String[] args) {
        Inheritance2 user = new Inheritance2();
        user.display();
    }
}
