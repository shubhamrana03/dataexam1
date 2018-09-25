import java.util.*;
class facto
{
int s;
 int fact(int n)
{
 if(n == 1)
{ 
 return (1);
}

s = fact(n-1);
return n*s;
}
}



public class l5code1
{
 public static void main(String[] args)
{
  Scanner in = new Scanner(System.in);
 int i=0,c=0;
i = in.nextInt();
facto f = new facto();
c=f.fact(i);
System.out.println(c);
}
}
 