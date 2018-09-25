import java.util.*;
class rev
{ 
char temp;
  void reve(char[] a1,int i,int j)
{ 
  temp=a1[i];
a1[i]=a1[j];
a1[j]=temp;


//System.out.println(a1[i]);


 
if(i<j)
{

 reve(a1,i+1,j-1);
}


}
}







public class l5code2
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 String a;   //data structure visualization
int b;
 a = in.next();
b = a.length();
char[] c1= a.toCharArray();
 rev r = new rev();
r.reve(c1,0,b-1);
String str=new String(c1);
System.out.println(str);
}
}