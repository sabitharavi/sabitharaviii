import java.io.*;
import java.util.*;
import java.util.Arrays;
class firrep
{
    public static void main(String args[])
    {
        int n,cnt=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[i+1])
            {
                cnt=a[i];
                break;
            }
        }
        System.out.print(cnt);
    }
}
