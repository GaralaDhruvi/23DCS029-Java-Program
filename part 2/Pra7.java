import java.util.*;
public class Pra7 {
  
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the number of copies: ");
        int n = sc.nextInt();

for(int i=0;i<n;i++)
{
System.out.print(str.substring(0,3));
}
        
    }
};

