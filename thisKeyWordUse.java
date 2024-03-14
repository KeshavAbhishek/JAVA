public class thisKeyWordUse {
    int a,b;
    thisKeyWordUse(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Add : " + (a+b));
    }
    public static void main(String[] args){
        thisKeyWordUse user =  new thisKeyWordUse(10,20);
    }
}
