class Shape{
    void about(){
        System.out.println("Shape method is called.");
    }
}

class Circle extends Shape{
    void about(){
        System.out.println("Circle class method is called.");
    }
}

public class E6Q5 {
    public static void main(String[] args) {
        
        Shape s = new Circle();
        s.about();
    }
}
