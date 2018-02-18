import java.io.*;
import java.util.*;
class zero
{
    public static void main(String args[])
    {
        int n,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int min1=0,min2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if((a[i]+a[j])==0)
                    {
                        
                        min1=a[i];
                        min2=a[j];
                    }
                }
                 
            }
        }
       
        System.out.print(min1+" "+min2);
        
        
    }
}
