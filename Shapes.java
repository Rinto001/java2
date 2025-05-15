import java.util.Scanner;

public class Shapes {
    void area(int r1) { // Overloaded function definition
        System.out.println("\nArea of Circle with Radius " + r1 + " = " + 3.14 * r1 * r1);
    }

    void area(int l1, int b1) {
        System.out.println("\nArea of Rectangle with dimensions " + l1 + " X " + b1 + " = " + (l1 * b1));
    }

    void area(int l2, int b2, int h2) {
        System.out.println("\nArea of Cuboid with dimensions " + l2 + " X " + b2 + " X " + h2 + " = " + (l2 * b2 * h2));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the Length");
        int l = s.nextInt();
        System.out.println("Enter the Breadth");
        int b = s.nextInt();
        System.out.println("Enter the Height");
        int h = s.nextInt();
        System.out.println("Enter the Radius");
        int r = s.nextInt();

        Shapes ob = new Shapes(); // Creating an object of Shapes class
        
        // Calling overloaded method area() with different parameters
        ob.area(r);
        ob.area(l, b);
        ob.area(l, b, h);

        s.close();
    }
}
