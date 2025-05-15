import java.util.Scanner;
public class EmpNetPay
{
    int empid,ta,da,hra,tax,netsal,basic;
    String empname;
    void getdata()

    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter employee name,id,basic pay,ta,da,hra and tax");
        empname=scan.nextLine();
        empid=scan.nextInt();
        basic=scan.nextInt();
        ta=scan.nextInt();
        da=scan.nextInt();
        hra=scan.nextInt();
        tax=scan.nextInt();
    }
    void calc()
    {
        netsal=(basic+ta+da+hra)-tax;
        System.out.println("Net salary:"+netsal);

    }
    public static void main(String[] args) {
        EmpNetPay e1=new EmpNetPay();
        e1.getdata();
        System.out.println("\n Employee details");
        System.out.println("................");
        System.out.println("Employee id:"+e1.empid);
        System.out.println("Employee name"+e1.empname);
        e1.calc();
    }
}