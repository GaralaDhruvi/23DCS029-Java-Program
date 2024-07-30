import java.util.Scanner;

class Budget {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days:");
        int numDays = sc.nextInt();

        
        if (numDays <= 0) {
            System.out.println("Number of days must be a positive integer.");
            sc.close();
            return;
        }

        double[] expenses = new double[numDays];

        for (int i = 0; i < numDays; i++) {
            System.out.println("Enter the expense for day " + (i + 1) + ":");
            expenses[i] = sc.nextDouble();
        }

        double totalExpense = 0;
        for (int i = 0; i < numDays; i++) {
            totalExpense += expenses[i];
        }

        System.out.printf("Total expense of the month: $%.2f%n", totalExpense);

        sc.close();
    }
}
