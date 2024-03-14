public class Q15 {
    public static void main(String[] args) {
        boolean match = true;

        if(args.length!=0){
            String string = args[0];
            int stringLen = string.length();

            for(int i = 0; i < stringLen/2; i++){
                if(string.charAt(i)!=string.charAt(stringLen-1-i)){
                    match = false;
                }
            }

            if(match){
                System.out.println(string + " is palindrome.");
            }
            else{
                System.out.println(string + " is not palindrome.");
            }
        }
    }
}
