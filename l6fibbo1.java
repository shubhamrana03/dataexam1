import java.util.*;
class fibbo
{ 
 int fib(int n)
{
 if(n==0)
{
 return 0;
}
 else if(n==1)
{
 return 1;
}
else
{
 //System.out.println(fib(n-1));
 return fib(n-1)+fib(n-2);
}
}
}

public class l6fibbo1
{
  public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 int a;
a=in.nextInt();
fibbo f = new fibbo();
int i=f.fib(a);
System.out.println(i);
}
}