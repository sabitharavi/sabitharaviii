import java.io.*;
import java.util.*;
class count
{
    public static void main(String args[])
    {
        int a,count=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a>0)
        {
          a /= 10;
            count=count+1;
        }
        System.out.println(count);
    }
}
