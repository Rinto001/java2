class Product
{
    int pcode;
    String pname;
    double price;
    Product(int c,String n, double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
    
    }
    void FindLowest(double price1,double price2,double price3)
    {
        if(price1<price2&&price1<price3)
        {
            System.out.println("\n product 1 is lowest price");
        }
        else if(price2<price1&&price<price3)
        {
            System.out.println("\n product 2 is lowest price");
        }
        else
        {
            System.out.println("\n product 3 is lowest price");
        }
    }

}
public class ProductDemo
{
    public static void main(String[] args)
    {
        Product obj1=new Product(101,"product_1",100.0);
        Product obj2=new Product(102,"product_2",123.40);
        Product obj3=new Product(103,"product_3",183.70);
        System.out.println("Product Information");
        System.out.println("....................");
        System.out.println("Product_code\tProduct_name\tproduct_price");
        obj1.display();
        obj2.display();
        obj3.display();
        obj1.FindLowest(obj1.price,obj2.price,obj3.price);

    }
}
