import Arithematic.Arithematic;
import Arithematic2.Arithematic2;

public class Example implements Arithematic2 {
    public float squareroot(int n){
        return (float) Math.sqrt(n);
    }

    public float cube(int n){
        return (float) n*n*n;
    }
}

class Main{
    public static void main(String[] a) {
        Example ex = new Example();
        System.out.println("Add : " + Arithematic.add(5, 10));
        System.out.println("Sub : " + Arithematic.sub(15, 20));
        System.out.println("Mul : " + ex.squareroot(25));
        System.out.println("Cube : " + ex.cube(15));
    }
}