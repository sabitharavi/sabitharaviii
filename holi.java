import java.io.*;
import java.util.*;
class holi
{
    public static void main(String args[])
    {
        String s=" ";
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        if((s=="saturday")||(s=="sunday"))
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
