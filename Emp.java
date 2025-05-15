import java.util.Scanner;
public class Emp
{
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Employee name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter emp no:");
        empno=scan.nextInt();
    
    }
    void display()
    {
        System.out.println("Employee name:"+name);
        System.out.println("Employee no: "+empno);

    }
    public static void main(String args[])
    {
        Emp e=new Emp();
        e.getData();
        System.out.println("\n\nEmployee details\n");
        System.out.println("\n\n..................\n");
        e.display();
    }
}