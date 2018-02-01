import java.io.*;
import java.util.*;
class inter
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        for(int k=i;k<=j;k++)
        {
            if(k%2!=0)
            {
                System.out.print(k+" ");
            }
        }
    }
}
