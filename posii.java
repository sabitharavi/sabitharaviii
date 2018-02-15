import java.io.*;
import java.util.*;
class posii
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2!=0&&a[i]%2==0)
            {
                System.out.print(a[i]);
            }
            else if(i%2==0&&a[i]%2!=0)
            {
                System.out.print(a[i]);
            }
        }
      
    }
}
