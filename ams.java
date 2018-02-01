import java.io.*;
import java.util.*;
class ams
{
    public static void main(String args[])
    {
        int a,sum,temp=1,n=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        temp=a;
        sum=0;
        while(a>0)
        {
            n=a%10;
            a=a/10;
            sum=sum+(n*n*n);
        }
        if(sum==temp)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
