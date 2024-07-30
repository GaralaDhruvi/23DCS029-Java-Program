import java.util.Scanner;

public class pra6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days for your exercise routine: ");
        int n = scanner.nextInt();

        scanner.close();

        System.out.println("Your exercise routine in Fibonacci series is:");
        generateFibonacci(n);
    }


    public static void generateFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("Day " + i + ": " + firstTerm + " minutes");
            
        
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
