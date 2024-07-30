import java.util.Scanner;

class pra12 {
    public static void main(String[] args) {
        int pounds = 0;

        
        if (args.length > 0) {
            pounds = Integer.parseInt(args[0]);
        } else {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount in Pounds: ");
            pounds = sc.nextInt();
            sc.close();
        }

        int rupees = pounds * 100;
        System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees.");
    }
}
