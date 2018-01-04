import java.io.*;
import java.util.*;
class num
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n>=1&&n<=100000)
{
if(n>0)
{
System.out.print("Positive");
}
else if(n<0)
{
System.out.print("Negative");
}
else
{
System.out.print("Zero");
}
}
}
