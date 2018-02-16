import java.io.*;
import java.util.*;
import java.util.Arrays;
class index
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        //int b[]=new int[n];
        TreeSet<Integer>set=new TreeSet<Integer>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i==a[i])
            {
                set.add(a[i]);
            }
        }
        /*Arrays.sort(b);
        for(int j=0;j<n;j++)
        {
        System.out.print(b[j]);
    }*/
    Iterator it=set.iterator();
    while(it.hasNext())
    {
        System.out.print(it.next()+" ");
    }
    }
}
