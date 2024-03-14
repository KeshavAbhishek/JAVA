// 1.Wap to create a class named shape. Create two objects of class shape. Calculate the area and perimeter.

public class E4Q1 {
    public int length, breadth;

    public void takeValue(int l, int b){
        length = l;
        breadth = b;
    }

    public void quadrilateral(){
        if(length == breadth){
            System.out.println("\nSquare: Length : " + length + "\tBreadth : " + breadth);
        }
        else{
            System.out.println("\nRectangle: Length : " + length + "\tBreadth : " + breadth);
        }
        System.out.println("Area : " + (length*breadth));
        System.out.println("Perimeter : " + (2*(length + breadth)) + "\n");
    }

    public void triangle(int a, int b, int c){
        if((a+b) > c && (b+c) > a && (a+c) > b){
            System.out.println("Perimeter of triangle : " + (a+b+c));
            double s = (a+b+c)/2.0;
            // double area = s;
            double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
            // area = Math.sqrt(area);
            System.out.println("Area of triangle : " + area);
        }
    }
    public static void main(String[] args) {
        E4Q1 user1 = new E4Q1();
        user1.takeValue(10, 20);
        user1.quadrilateral();

        E4Q1 user2 = new E4Q1();
        user2.takeValue(100, 100);
        user2.quadrilateral();

        E4Q1 user3 = new E4Q1();
        user3.triangle(4, 5, 6);
    }
}