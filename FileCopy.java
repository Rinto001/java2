
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            FileInputStream fi=new FileInputStream("bca.txt");
            FileOutputStream fo= new FileOutputStream("mca.txt");
            int i;
            while((i=fi.read())!=-1)
            {
                fo.write(i);
            }
            System.out.println("Succesfully copied one file to another");
            fi.close();
            fo.close();


        }
        catch(IOException e)
        {
            System.out.println("error:"+e.getMessage());
        }

    }
        
    }

