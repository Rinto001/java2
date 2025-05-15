
import java.util.Scanner;
public class Addition {
    void sum(int s1) {
        System.out.println("Sum of the number " + s1 + " = " + s1);
    }
    void sum(int s1, int s2) {
        System.out.println("Sum of two numbers " + s1 + " + " + s2 + " = " + (s1 + s2));
    }
    void sum(double s3, double s4) {
        System.out.println("Sum of two decimal numbers " + s3 + " + " + s4 + " = " + (s3 + s4));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Addition add = new Addition();
        System.out.println("Enter the first number (integer):");
        int s1 = s.nextInt();
        System.out.println("Enter the second number (integer):");
        int s2 = s.nextInt();
        System.out.println("Enter the first decimal number:");
        double s3 = s.nextDouble();
        System.out.println("Enter the second decimal number:");
        double s4 = s.nextDouble();
         add.sum(s1);         
        add.sum(s1, s2);     
        add.sum(s3, s4);      
        s.close(); 
    }
}
