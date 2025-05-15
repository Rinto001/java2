public class RectArea
{
    double l,b;
    void getData(double length,double breadth)
    {
        l=length;
        b=breadth;
    }
    double calArea()
    {
        return l*b;
    }
    public static void main(String args[])
    {
        RectArea r=new RectArea();
        r.getData(12.38,13);
        System.out.println("Area of rectangle= "+r.calArea());
        
    }
}