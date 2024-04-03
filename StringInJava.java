import java.lang.String;

class StringInJava{
    public static void main(String[] args) {
        String s = "cvraman";
        String x = new String("Welcome");
        System.out.println(s + " " + x);
        System.out.println();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(0));
        System.out.println("LENGTH : " + s.length());
        System.out.println(s.equals(x));
        System.out.println(s.isEmpty());
        s = s.replace(s, "CGU");
        System.out.println(s);

        String data = "C        G           U";

        System.out.println(data.trim());
        System.out.println();


        String d = "Rahul";
        
        System.out.println(d.concat(" Yadav"));
    }
}