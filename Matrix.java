import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args) {
        
    
    int row,col,m,n;
    Scanner s= new Scanner(System.in);
    System.out.println("enter the number of rows");
    row=s.nextInt();
    System.out.println("enter the number of coloumns");
    col=s.nextInt();
    int matA[][]=new int[row][col];
    System.out.println ("enter the elements of matrix:");
     for(m=0;m<row;m++)
     {
        for(n=0;n<col;n++)
        {
             matA[m][n]=s.nextInt();

        }
     }
     System.out.println("Matrix");
     System.out.println("........");
     for(m=0;m<row;m++)
     {
        for(n=0;n<col;n++)
        {
            System.out.print(matA[m][n]+ "\t");

        }
        System.out.println("");
     }
}
}
