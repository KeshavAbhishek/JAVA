public class Q7 {
    public void check(char data){
        if((int)data>=48 && (int)data <=57){
            System.out.println("Digit");
        }
        else if(((int)data>=65 && (int)data <=65+25) || ((int)data>=97 && (int)data <=97+25)){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Special Character");
        }
    }
    public static void main(String[] args) {
        Q7 obj = new Q7();
        obj.check('A');
        obj.check('0');
        obj.check('-');

    }
}