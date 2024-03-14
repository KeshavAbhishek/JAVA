public class Q11 {
    public static void main(String[] args) {
        String[] months = {
            "January","February","March",
            "April","May","June",
            "July","August","September",
            "October","November","December"
        };
        if(args.length!=0){
            int month = Integer.parseInt(args[0]);
            if(month>12){
                System.out.println("Invalid Month");
            }
            else{
                System.out.println(months[month-1]);
            }
        }
        else{
            System.out.println("Please enter the month in numbers.");
        }
    }
}
