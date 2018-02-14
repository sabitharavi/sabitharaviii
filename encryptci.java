import java.io.*;
import java.util.*;
class encryptci
{
    public static void main(String args[])
    {
        String s1=" ";
        StringBuffer s2=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isUpperCase(s1.charAt(i)))
            {
                char ch=(char)(((int)s1.charAt(i)+3-65)%26+65);
                s2.append(ch);
            }
            else
            {
                char ch=(char)(((int)s1.charAt(i)+3-97)%26+97);
                s2.append(ch);
            }
        }
        System.out.println(s2);
    }
}
