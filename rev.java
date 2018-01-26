import java.io.*;
import java.util.*;
class rev
{
    public static void main(String args[])
    {
        int num,j=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>0)
        {
        j = j* 10;
          j =  + num%10;
          num = num/10;
        System.out.print(j);
        }
    }
}
