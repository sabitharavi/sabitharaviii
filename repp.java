import java.io.*;
import java.util.*;
import java.util.Arrays;
class repp
{
public static void main(String args[])
{
       int i,j,n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int a[]=new int[n];
      TreeSet<Integer>set=new TreeSet<Integer>();
      if(n>=1&&n<=10000)
      {
     for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        }
        else
        {
        System.out.println("Exceed size");
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
                            System.out.print("UNIQUE");
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
