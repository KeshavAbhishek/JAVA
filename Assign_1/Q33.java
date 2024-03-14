// Parent class
class Animal {
    // Method to eat
    public void eat() {
        System.out.println("Animal is eating");
    }
    
    // Method to sleep
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class inheriting from Animal
class Bird extends Animal {
    // Method to override eat
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
    
    // Method to override sleep
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }
    
    // New method for Bird class
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class Q33 {
    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal animal = new Animal();
        
        // Invoking eat and sleep methods using the Animal object
        animal.eat();
        animal.sleep();
        
        // Creating an instance of Bird
        Bird bird = new Bird();
        
        // Invoking eat, sleep, and fly methods using the Bird object
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
