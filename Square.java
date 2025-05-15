public class Square
{
    double a;
    void getData(double side)
    {
        a=side;
    }
    double CalArea()
    {
        return a*a;
    }
    public static void main(String args[])
    {
        Square S =new Square();
        S.getData(65);
        System.out.println("Area of square="+S.CalArea());
    }
}