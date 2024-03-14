public class E4Q4 {
    public int value = 10;

    public static void callme(){
        System.out.println("Instance Variable : " + value);
    }
    public static void main(String[] args){
        E4Q4 user = new E4Q4();
        user.callme();
    }
}