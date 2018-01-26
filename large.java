import java.io.*;
import java.util.*;
public class large
{
public static void main(String args[])
{
int i,j,k,l;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
k=sc.nextInt();
l=i > j ? (i > k ? i : k) : (j > k ? j : k) ;
System.out.println(l);
}
}
