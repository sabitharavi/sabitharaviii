import java.io.*;
import java.util.*;
class pow
{
    public static void main(String args[])
    {
      double a,b,sum;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=Math.pow(a,b);
        System.out.println(sum);
    }
}
