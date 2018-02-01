import java.io.*;
import java.util.*;
class fact1
{
    public static void main(String args[])
    {
        int num,cn=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++){    
         cn=cn*i;    
        }
        System.out.println(cn);
    }
}
