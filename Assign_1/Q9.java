public class Q9 {
    public static void main(String[] args){
        char data = 'A';
        if(Character.isUpperCase(data)){
            System.out.println(data +"->" + Character.toLowerCase(data));
        }
        if(Character.isLowerCase(data)){
            System.out.println(data +"->" + Character.toUpperCase(data));
        }
    }
}
