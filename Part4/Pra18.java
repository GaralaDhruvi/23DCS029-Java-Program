import java.util.Scanner;

public class Pra18 {
   public Pra18() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Employee var2 = new Employee();
      System.out.println("Enter employee details:");
      System.out.print("Name: ");
      var2.name = var1.nextLine();
      System.out.print("Age: ");
      var2.age = var1.nextInt();
      var1.nextLine();
      System.out.print("Phone Number: ");
      var2.phoneNumber = var1.nextLine();
      System.out.print("Address: ");
      var2.address = var1.nextLine();
      System.out.print("Salary: ");
      var2.salary = var1.nextDouble();
      var1.nextLine();
      System.out.print("Specialization: ");
      var2.specialization = var1.nextLine();
      System.out.println("\nEmployee Details:");
      var2.displayEmployeeDetails();
      Manager var3 = new Manager();
      System.out.println("\nEnter manager details:");
      System.out.print("Name: ");
      var3.name = var1.nextLine();
      System.out.print("Age: ");
      var3.age = var1.nextInt();
      var1.nextLine();
      System.out.print("Phone Number: ");
      var3.phoneNumber = var1.nextLine();
      System.out.print("Address: ");
      var3.address = var1.nextLine();
      System.out.print("Salary: ");
      var3.salary = var1.nextDouble();
      var1.nextLine();
      System.out.print("Department: ");
      var3.department = var1.nextLine();
      System.out.println("\nManager Details:");
      var3.displayManagerDetails();
      System.out.print("23DCS036_kreshi_goti");
   }
}
