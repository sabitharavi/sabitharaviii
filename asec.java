import java.io.*;
import java.util.*;
import java.util.Arrays;
class asec
{
    public static void main(String args[])
   {
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       String a[]=new String[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextLine();
       }
       Arrays.sort(a);
       for(int i=0;i<n;i++)
       {
       System.out.print(a[i]+" ");
       }
    }
}

