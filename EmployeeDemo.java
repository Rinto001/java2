class Employee
{
    int eno;
    String ename;
    Employee(int e,String en)
    {
        eno=e;
        ename=en;
    }
    void display()
    {
        System.out.println("Employee details");
        System.out.println("..............");
        System.out.println("Name:"+ename);
        System.out.println("empno:"+eno);


    }
}
    public class EmployeeDemo
    {
        public static void main(String[] args)  
        {
            Employee ob=new Employee(125,"adarsh");
            ob.display();
        }
    }
