import java.io.*;
import java.util.*;
class pali
{
    public static void main(String args[])
    {
        int r,sum=0,temp,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("yes ");    
  else    
   System.out.println("no");    
        
    }
}
