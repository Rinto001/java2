
import java.util.Scanner;

public class StringManip{
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("length of the string="+str1.length());
        System.out.println("character at second postion="+str1.charAt(1));
        System.out.println("string contain 'ple' sequences="+str1.contains("ple"));
        System.out.println("string end with 'e'="+str1.endsWith("e"));
        System.out.println("replace 'pp' with 'nk="+str1.replaceAll("pp","nk"));
        System.out.println("lower case:="+str1.toLowerCase());
        System.out.println("uppercase="+str1.toUpperCase());
        System.out.println("index of 'e'="+str1.indexOf('e'));
        System.out.println("length of the string="+str1.substring(2));
        System.out.println("substring from index2:"+str1.substring(2));
        System.out.println("enter 2nd string");
        String Str2=sc.nextLine();
        System.out.println("string1 concatenated with string2="+str1.concat(Str2));



        
        
    }
}