import java.util.*;
public class l2code1
{
public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
int t,j=0;;
 int[] mar = new int[6];
//int[] marr = new int[6];
for(int i=0;i<6;i++)
{
 mar[i]=in.nextInt();
}
j = 6-1;
for(int i=0;i<3;i++)
{
if(mar[i]==0 )
{
 if(mar[j]!=0)
{
--j;
}
t=mar[i];
mar[i]=mar[j];
mar[j]=t;
}
}

System.out.println("Answer");
for(int i=0;i<6;i++)
{
 System.out.println(mar[i]);

}
}
}


