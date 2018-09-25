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
 for( i=0;i < str.length();i++)
{
  char c1 = str.charAt(i);
  if(c1 == '*')
{
 c1 ='+';

}
System.out.print(c1);

}

System.out.println();

}
}