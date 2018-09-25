import java.util.Scanner;
public class l1code1 {
 public static void main(String[] args)
{
  
 Scanner in = new Scanner(System.in);

int i,n;
n = in.nextInt();
int[] mar = new int[10];
for(i=0;i<n;i++)
{
 mar[i]=in.nextInt();
}

for(i=0;i<n;i++)
{
  if(mar[i]+mar[i+1] == 10)
{
  System.out.print(" "+mar[i]);
}
}

}
}
