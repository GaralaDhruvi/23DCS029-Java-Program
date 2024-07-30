import java.util.Scanner;

 class pra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] productCodes = {1, 2, 3, 4, 5};  
        double[] prices = {100.0, 200.0, 150.0, 50.0, 30.0};  

        System.out.println("Electric Appliance Shop Billing System");

        
        System.out.print("Enter product code: ");
        int code = sc.nextInt();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        double taxRate = 0.0;

        
        switch (code) {
            case 1:
                taxRate = 0.08; 
                break;
            case 2:
                taxRate = 0.12; 
                break;
            case 3:
                taxRate = 0.05; 
                break;
            case 4:
                taxRate = 0.075; 
                break;
            default:
                taxRate = 0.03; 
                break;
        }

        
        double taxAmount = price * taxRate;
        double totalPrice = price + taxAmount;

        
        System.out.println("Product Code: " + code);
        System.out.println("Product Price: " + price);
        System.out.println("Sales Tax: " + taxAmount);
        System.out.println("Total Price: " + totalPrice);

        sc.close();
    }
}
