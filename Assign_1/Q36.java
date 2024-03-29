class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }

    void erase(){
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }

    void erase(){
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }

    void erase(){
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }

    void erase(){
        System.out.println("Erasing Square");
    }
}

public class Q36 {
    public static void main(String[] args) {
        
        Shape c = new Circle();c.draw();c.erase();
        System.out.println();
        Shape t = new Triangle();t.draw();t.erase();
        System.out.println();
        Shape s = new Square();s.draw();s.erase();
    }
}