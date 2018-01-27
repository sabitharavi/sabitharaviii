import java.io.*;
import java.util.*;
import java.Arrays.*;
class rep
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
int a[]=new int[i];
Arrays.sort();
for(int j=0;j<=a.length();j++)
{
for(int k=j+1;k<=a.length();k++)
{
if(a[j]==a[k])
{
int a1=a[j];
}
}
System.out.println(a1);
}
}


