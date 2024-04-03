import java.util.*;

public class E8Q2 {
    public static void main(String[] args) {
        
        String str1;
        String str2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter str1 : ");
        str1 = sc.nextLine();
        System.out.print("Enter str2 : ");
        str2 = sc.nextLine();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];

        if(str1.length() == str2.length()){
            System.out.println("Same Length.");
            int i = 0;
            while(i < str1.length()){
                arr1[i] = str1.charAt(i);
                arr2[i] = str2.charAt(i);
                i++;
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.println("YES,IT IS ANAGRAM.");
            }
        }else {
            System.out.println("NO,IT IS NOT ANAGRAM !");
        }

    }
}