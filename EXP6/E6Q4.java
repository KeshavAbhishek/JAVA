interface Car {
    public String carname = "";
    public int price = 0;

    public abstract void start();
    public abstract void stop();
    public abstract void running();
}

class Toyota implements Car{

    String carname = "Toyota";
    int price = 1000000;
    
    public void start(){
        System.out.println("Toyota has started.");
    }

    public void stop(){
        System.out.println("Toyota has stopped.");
    }

    public void running(){
        System.out.println("Toyota is running.");
    }
}

public class E6Q4 {
    public static void main(String[] args) {
        Toyota car = new Toyota();
        System.out.println("Car name : " + car.carname);
        System.out.println("Car price : " + car.price);
        car.start();
        car.start();
        car.running();
    }
}