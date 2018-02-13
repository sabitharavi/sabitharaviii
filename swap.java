import java.io.*;
import java.util.*;
class swap
{
    public static void main(String args[])
{
        String s=" ";
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char a[]=s.toCharArray();
        int l=a.length-1;
        if(l%2==0)
        {
        for(int i=0;i<l;i+=2)
        {
            
                char temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            
        }
        }
        else
        {
            for(int i=0;i<l;i+=2)    
            {
                 char temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        String aa=new String(a);
        System.out.print(aa);
}
}
       
