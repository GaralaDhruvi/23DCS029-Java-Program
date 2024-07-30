import java.util.Scanner;

class pra9 {
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        String result = doubleChar(input);
        System.out.println("Doubled string: " + result);

        sc.close();
    }
}
