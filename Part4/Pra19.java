import java.util.Scanner;


class Rectangle {
    public double l; 
    public double b; 

    
    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    
    public void printArea() {
        double area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }

    
    public void printPerimeter() {
        double perimeter = 2 * (l + b);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}


class Square extends Rectangle {
    
    public Square(double s) {
        super(s, s);
    }
}

public class Pra19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();

        
        Rectangle rectangle = new Rectangle(l, b);

       
        System.out.print("Enter the side of the square: ");
        double s = sc.nextDouble();

        
        Square square = new Square(s);

        
        Rectangle[] shapes = { rectangle, square };

        
        for (Rectangle shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("\nSquare:");
            } else {
                System.out.println("\nRectangle:");
            }
            shape.printArea();
            shape.printPerimeter();
        }

        sc.close();
    }
}
