import java.util.Scanner;

class NumberToWord {
    private static final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(convertNumberToWord(number));
    }

    public static String convertNumberToWord(int number) {
        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }

        if (number < 1000) {
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + convertNumberToWord(number % 100);
        }

        if (number < 1000000) {
            return convertNumberToWord(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " : "") + convertNumberToWord(number % 1000);
        }

        if (number < 1000000000) {
            return convertNumberToWord(number / 1000000) + " Million" + ((number % 1000000 != 0) ? " " : "") + convertNumberToWord(number % 1000000);
        }

        return convertNumberToWord(number / 1000000000) + " Billion" + ((number % 1000000000 != 0) ? " " : "") + convertNumberToWord(number % 1000000000);
    }
}