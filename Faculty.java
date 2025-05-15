import java.util.Scanner;
public class Faculty
{
    int age;
    String name;
    void getData()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("\nEnter the Faculty name:");
        name=ob.nextLine();
        System.out.println("Enter the age:");
        age=ob.nextInt();

    }
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }
    public static void main(String args[])
    {
        Faculty f=new Faculty();
        f.getData();
        System.out.println("\n\nFaculty details\n");
        System.out.println("\n\n...............\n");
        f.display();
    }
}