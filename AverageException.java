
import java.util.Scanner;

class InputException extends Exception
{
    
    
        public InputException(String msg)
        {
            super(msg);
        }
    
}
public class AverageException
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter no of intergers");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the intergers");
        try {
            for (int i = 0; i < n; i++) {
                int num=s.nextInt();
                if(num<0){
                    throw new InputException("Number is not postive");
                }
                sum+=num;
            }
            float avg=(float) sum/n;
            System.out.println("Average is:" +avg);
            
        } catch (InputException e) {
            System.out.println(e);
        } 

    
    }
}