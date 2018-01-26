import java.io.*;
import java.util.*;
public class leap
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
if(i%4==0||i%400==0)
{
System.out.println("leap");
}
else
{
System.out.print("Not leap");
}
}
}
