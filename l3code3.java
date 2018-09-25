import java.util.*;
public class l3code2 
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
//char c1;
System.out.println("Enter a string");

 String str = in.next();
int i=0,a1=0;
char[] c2= new char[];
char[] c1 = str.toCharArray();
 for( i=0;i < str.length();i++)
{
  if(c1.CharAt(i) == c1.CharAt(i+1))
{
 
}
 else if (c1.CharAt(i) != c1.CharAt(i+1))
 {
   c1[i]=c2[i];
System.out.println(c2[i]);
}
}
}
}
