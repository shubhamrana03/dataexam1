import java.util.*;
class l2code3 
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 String str = in.next();
int i,a2=0;
if(str.length()< 8 || str.length()>15)
{
 System.out.println("Password should be greater than 8 and less than 15");
}
else
{
 //char[] yo= a.toCharArray();
for( i=0;i < str.length();i++)
{
  char c = str.charAt(i);
  if (('a' <= c && c <= 'z')|| ('A' <= c && c <= 'Z')|| ('0' <= c && c <= '9') ||(c =='!' ||c =='@' ||c =='#' ||c =='$' ||c =='^' ||c =='&' ||c =='*' ||c =='%')) 
{ 
 //System.out.print("Password is valid");
//System.out.println(c);
}
}
System.out.println(str);
System.out.print("Password is valid");

}
}
}