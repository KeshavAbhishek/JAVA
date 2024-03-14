class A {
    public void nature(){
        System.out.println("chutiya");
    }
    public void dil_se(){
        System.out.println("Dil se insan thik h ");
    }
}
class B extends A{
    public void look(){
        System.out.println("thik thak");
    }
    @Override
    public void dil_se(){
        System.out.println("choro aab ka h bole");
    }
}
public class Aman {
    public static void main(String[] args) {

        System.out.println("\nNormally calling class a");
        A a = new A();
        a.nature();
        a.dil_se();
        
        System.out.println("\nnormally calling class b");
        B b = new B();
        b.look();
        b.dil_se();
        
        System.out.println("\nnormally calling  super class method from subclass using 'DYNAMIC METHORD DISPATCH'\n");
        A c = new B();
        c.nature();
        c.dil_se();
    }
}