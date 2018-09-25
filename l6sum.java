import java.util.*;
class summ
{
 int i=0;
 int suum(int a1,int b1)
{
 if(b1>0)
{
 i=i+a1;
b1--;
suum(a1,b1); // recursion is a type in which function calls back itself again.
}
return i;
}
}
public class l6sum
{
 public static void main(String[] args)
{
  Scanner in = new Scanner(System.in);
 int a=0,i;
int b=0;
a=in.nextInt();
b=in.nextInt();
summ s = new summ();
i=s.suum(a,b);
System.out.println(i);
} 
}
 