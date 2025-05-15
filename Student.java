import java.util.Scanner;
public class Student
{
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
    void getData()
     {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter the student Name,rollno amd mark of 3 subject:");
        name=scan.nextLine();
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
     }
     void cal()
     {
        total=m1+m2+m3;
        average=total/3.0f;
        System.out.println("total marks: "+total);

     }
     public static void main(String args[])
     {
        Student r=new Student();
        r.getData();
        System.out.println("\n\nStudent details\n");
        System.out.println("name:"+r.name);
        System.out.println("roll no:"+r.rollno);
        r.cal();   
     }
} 