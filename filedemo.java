import java.io.*;
import java.util.*;
public class filedemo 
{
    public static void main(String[] args)
    {
        String filename;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file name:");
        filename = s.nextLine();
        File f1 = new File(filename);
        System.out.println("FILE INFORMATION");
        System.out.println("Enter file name"+f1.getName());
        System.out.println("Enter file path"+f1.getPath());
        System.out.println("PARENT"+f1.getParent());
        if(f1.exists())
        {
            System.out.println("The file exists");
        }
        else
        {
            System.out.println("The file doesnt exist");
        }
        if(f1.canRead())
        {
            System.out.println("The file can be read");
        }
        else
        {
            System.out.println("The file cannot be read");
        }
        if(f1.canWrite())
        {
            System.out.println("Write operation is permitted");
        }
        else
        {
            System.out.println("Write operation is not permitted");
        }
        if(f1.isDirectory())
        {
            System.out.println("It is a directory");
        }
        else
        {
            System.out.println("Not a directory");
        }
        if(f1.isFile())
        {
            System.out.println("It is a file");
        }
        else
        {
            System.out.println("Not a file");
        }
        System.out.println("File last modified"+f1.lastModified());
        System.out.println("Length of the file"+f1.length());
        System.out.println("FILE DELETED"+f1.delete());
    }
}
