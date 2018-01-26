import java.io.*;
import java.util.*;
public class digit
{
public static void main(String args[])
{
int i,count=0;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
for(int j=1;j<=i;j++)
{
count=count+j;
}
System.out.println(count);
}
}
