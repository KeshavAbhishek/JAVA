// Q3. WAP to use “this” keyword to refer to current class parameterized constructor

public class E4Q3 {
    int a,b;
    E4Q3(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Add : " + (a+b));
    }
    public static void main(String[] args){
        E4Q3 user =  new E4Q3(10,20);
    }
}
