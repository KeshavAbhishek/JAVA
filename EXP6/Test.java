interface A{
    int x = 5;
}

interface B{
    int y = 5;
}

class C implements A, B{
    void run(){
        System.out.println((x + y));
    }
}

public class Test {
    public static void main(String[] args) {
        
        C c = new C();
        c.run();
    }
}
