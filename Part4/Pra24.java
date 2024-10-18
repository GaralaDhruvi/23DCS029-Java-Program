import java.util.Scanner;

public class Pra24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first integer (x): ");
            int x = Integer.parseInt(sc.nextLine());

            System.out.print("Enter the second integer (y): ");
            int y = Integer.parseInt(sc.nextLine());

            
            int result = x / y;
            System.out.println("The result of " + x + " / " + y + " is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

        sc.close();
    }
}
