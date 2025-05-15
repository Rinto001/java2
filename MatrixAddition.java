
import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String[] args) {
        int row,col,i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        row=s.nextInt();
        System.out.println("Enter the number of coloumn ");
        col=s.nextInt();
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        int res[][]=new int[row][col];
        System.out.println("Enter the element of matrix-1");
        for ( i = 0; i < row; i++) {
            for (j=0;j<col;j++){
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the element of matrix-2");
        for ( i = 0; i < row; i++) {
            for(j=0;j<col;j++){
                mat2[i][j]=s.nextInt();
                res[i][j]=mat1[i][j]+mat2[i][j];

            }
        }
        System.out.println("Sum of matrix:");
        for(i=0;i<row;i++)
        {
            for (j=0;j<col;j++)
            {
                System.out.println(res[i][j]+ "\t");
                System.out.println("");
            }
        }
    
}