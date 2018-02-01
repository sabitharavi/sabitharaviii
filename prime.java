import java.io.*;
import java.util.*;
class prime
{
    public static void main(String args[])
    {
       int n,count=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n<=1000)
       {
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               count++;
           }
       }
       }
       if(count==2)
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
    }
}


