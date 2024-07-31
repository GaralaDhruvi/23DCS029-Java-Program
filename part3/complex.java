import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex other) {
        double r = real + other.real;
        double i = imaginary + other.imaginary;
        return new Complex(r, i);
    }
    Complex subtract(Complex other) {
        double r = real - other.real;
        double i = imaginary - other.imaginary;
        return new Complex(r, i);
    }
    Complex multiply(Complex other) {
        double r = (real * other.real) - (imaginary * other.imaginary);
        double i = (real * other.imaginary) + (imaginary * other.real);
        return new Complex(r, i);
    }


    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginary1 = sc.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        
        System.out.print("Enter real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginary2 = sc.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        sc.close();
    }
}



