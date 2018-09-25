import java.util.*;
class node
{
 node head = null;
 int data;
 node next;
public node()
{
 this.data=0;
 this.next= null;
}
public node(int data1)
{
 this.data=data1;
 this.next= null;
}

public node add(int data)
{
  node a = new node(data);
  if(head == null)
{
head=a;
}
else
{ 
 node temp = head;
   while(temp.next!=null) //tb tak chlega jb tk use next me null nahi mil jata.
{
 temp=temp.next;
}

temp.next=a;
}
return head;
}







public node ait(int pos,int data)
{



  int i=0;
   node a1 = new node();
   a1.next=head;
   node temp=a1;
   
   for(i=1;i<pos;i++)
   { 
   	temp = temp.next;
   }
   	node node = new node();
   	node.data=data;
   	node.next=temp.next;
   	temp.next=node;
   		

   		return a1.next;
   	


}

  
 

public void printlist(node head)
{
 node temp=head;
while(temp!=null)
{
 

 System.out.print(temp.data);
 System.out.println();
temp=temp.next;
}
}
}

public class l9ith
{
public static void main(String[] args) 
{
node l = new node();
 Scanner in = new Scanner(System.in);
 int d;
 d = in.nextInt();
 node h=null;
 while(d!=0)
{
int n=in.nextInt();
 h=l.add(n);
 d--;
}
 System.out.println("Answer is");

l.printlist(h);
 System.out.println("Enter position ");
 int q=in.nextInt();
 System.out.println("Enter element ");
 int r=in.nextInt();
 h = l.ait(q,r); 
  System.out.println("After inserting");
  l.printlist(h);



}
}