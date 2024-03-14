class Calculator{
    int powerInt(int num1, int num2){
        int data = 1;
        for(int i = 0; i < num2; i++){
            data = data * num1;
        }

        return data;
    }

    double powerDouble(double num1, int num2){
        double data = 1.0;
        for(int i = 0; i < num2; i++){
            data = data * num1;
        }

        return data;
    }
}

public class Q31 {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();
        System.out.println("5 to the power 3 is " + obj.powerInt(5,3));
        System.out.println("5.5 to the power 3 is " + obj.powerDouble(5.5,3));

    }
}