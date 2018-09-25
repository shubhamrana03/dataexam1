import java.util.*;
public class l3code1 
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
System.out.println("Password must contain a upper case, lower case,number and a special character \n");
 String str = in.next();
int i,l=0,u=0,n=0,sp=0;
if(str.length()< 8 || str.length()>15)
{
 System.out.println("Password should be greater than 8 and less than 15");
}
else
{
 
for( i=0;i < str.length();i++)
{
  char c = str.charAt(i);
  if ('a' <= c && c <= 'z') 
{ 
   l++;
}

 else if ('A' <= c && c <= 'Z')
{
  u++;
}

else if ('0' <= c && c <= '9')
{
 n++;
}
else
{
 sp++;
}
}

if (l>=1 && u>=1 && n>=1 && sp>=1)
{
   System.out.print("Password is valid");
   System.out.println(str);
  System.out.println();
}

else
{
 System.out.println("Pasword is invalid");
System.out.println();
}
}
}


}






