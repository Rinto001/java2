
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite{
    public static void main(String[] args)
    {
        try 
        {
            Scanner s=new Scanner(System.in);
            System.out.print("\nEnter file name:");
            String fname=s.nextLine();
            FileWriter obW=new FileWriter(fname,true);
            System.out.println("\n Enter entries into files");
            int n=s.nextInt();
            String data;
            for (int i = 0; i <= n; i++) {
                data=s.nextLine();
                obW.write(data + "\n");
            }
            obW.close();
            FileReader obR=new FileReader(fname);
            BufferedReader br=new BufferedReader(obR);
            String line;
            System.out.println("Data read from"+fname+"file");
            while((line=br.readLine())!=null)
            {
                System.out.println(line);

            }
            obR.close();
              


            
        } 
        catch(IOException e)
        {
            System.out.println("-----Error---");
        }
        }
    }

