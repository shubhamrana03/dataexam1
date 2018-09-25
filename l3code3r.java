import java.util.*;
public class l3code3r
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
String s=in.next();
s=s+" ";
int l=s.length();
String p="";
char ch1,ch2;
for(int i=0;i<l-1;i++)
{
 ch1=s.charAt(i);
ch2=s.charAt(i+1);
if(ch1!=ch2)
{
 p=p+ch1;
}
}
System.out.print(p);
}
}