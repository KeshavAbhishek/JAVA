interface ShapeInterface{
    double findArea();
}

interface SquareInterface{
    public void square(double side);
    public double findArea();
}

interface RectangleInterface{
    public void rectangle(double length, double width);
    public double findArea();
}

class Shape implements ShapeInterface{
    public double findArea() {
        return 0; // Default implementation, overridden by subclasses
    }
}

class Square implements SquareInterface{
    private double side;

    public void square(double side) {
        this.side = side;
    }

    public double findArea() {
        return side * side;
    }
}

class Rectangle implements RectangleInterface {
    private double length;
    private double width;

    public void rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // @Override
    public double findArea() {
        return length * width;
    }
}

public class E6Q3 {
    public static void main(String[] args) {
        Square square = new Square();
        square.square(5);
        Rectangle rectangle = new Rectangle();
        rectangle.rectangle(4, 6);

        System.out.println("Area of square: " + square.findArea());
        System.out.println("Area of rectangle: " + rectangle.findArea());
    }
}
