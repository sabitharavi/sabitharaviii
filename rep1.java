import java.io.*;
import java.util.*;
import java.util.Arrays;
class rep1
{
public static void main(String args[])
{
       int i,j,n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int a[]=new int[n];
      TreeSet<Integer>set=new TreeSet<Integer>();
     for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       Arrays.sort(a);
        for(i=0;i<n;i++)
            {
                if(i<n-1)
                {
                    if(a[i]==a[i+1])
                    {
                        set.add(a[i]);
                    }
                }
            }
                        if(set.isEmpty())
                        {
                            System.out.print("NO DUPLICATE ELEMENTS");
                        }
                        else
                        {
                            Iterator it=set.iterator();
                            while(it.hasNext())
                            {
                                System.out.print(it.next()+" ");
                            }
                        }
                
             
    }
}
