import java.io.*;
import java.util.*;
class strr
{
    public static void main(String args[])
    {
        String s=" ";
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String arr[]=s.split(" ");
        for(int i=0;i<=arr.length-1;i++)
        {
            
            StringBuffer s1=new StringBuffer(arr[i]);
            System.out.print(s1.reverse()+" ");
        }
       
    }
}



