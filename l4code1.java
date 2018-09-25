import java.util.*;
public class l4code1
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
String s=in.next();
String s1=" ";
s=s+s1; //if space is on next to the last array character element
int l=0,c=1,c2=0,i=0;
l=s.length();
char[] c1=s.toCharArray();
for(i=0;i<l-1;i++)
{
    
      if(c1[i] == c1[i+1])
     {
        c++;
     }

      else
     { 
        if(c == 1)
        {
           System.out.print(s.charAt(i)); 
        }
	else
	{ 
                 System.out.print(s.charAt(i));
     		System.out.print(c);
        	c =c-c+1;
 	}      
     }

}


System.out.println();
}
}