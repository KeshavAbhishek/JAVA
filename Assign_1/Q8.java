public class Q8 {
    public static void main(String[] args){
        int age = Integer.parseInt(args[1]);

        if(age>=1 && age<=58){
            if(args[0].equals("Male")){
                System.out.println("Interest : 8.4%");
            }
            if(args[0].equals("Female")){
                System.out.println("Interest : 8.2%");
            }
        }

        if(age>=59 && age<=100){
            if(args[0].equals("Male")){
                System.out.println("Interest : 10.5%");
            }
            if(args[0].equals("Female")){
                System.out.println("Interest : 9.2%");
            }
        }
    }
}
