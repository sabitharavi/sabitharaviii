import java.io.*;
import java.util.*;
import java.util.Arrays;
class relist
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        TreeSet<Integer> set=new TreeSet<Integer>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--)
        {
           
            System.out.print(a[i]);
        }
        
    }
}

