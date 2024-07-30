import java.util.Scanner;
import java.util.Arrays;

class Pra10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        
        int length = input.length();
        System.out.println("Length of the string: " + length);

String lowercase = input.toLowerCase();
        System.out.println("Lowercase of the string: " + lowercase);

        
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase of the string: " + uppercase);

        
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);
        System.out.println("Sorted string: " + sorted);

        sc.close();
    }
}
