class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + " which tastes " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name + " which tastes sweet and crisp");
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name + " which tastes tangy and juicy");
    }
}


// TestFruit.java
public class Q35_ {
    public static void main(String[] args) {
        Fruit apple = new Apple("Apple", "sweet", "medium");
        Fruit orange = new Orange("Orange", "tangy", "medium");

        apple.eat();
        orange.eat();
    }
}
