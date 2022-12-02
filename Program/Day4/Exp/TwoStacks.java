
import java.util.Scanner;

class Stack2{
	int s[],tos1,tos2,MaxSize;
	
	public void createArray(int size)
	{
		MaxSize = size;
		tos1=MaxSize;
		tos2=-1;
		s = new int[MaxSize];
	}
	public void pushInStack1(int e)
	{
		tos1--;
		s[tos1] = e;
	}
	public void pushInStack2(int e)
	{
		tos2++;
		s[tos2] = e;
	}
	public int popFromStack1()
	{
		return s[tos1++];
	}
	public int popFromStack2()
	{
		return s[tos2--];
	}
	public boolean isStack1Full()
	{
		if(tos1-1==tos2)
			return true;
		else 
			return false;
	}
	public boolean isStack2Full()
	{
		if(tos2+1==tos1)
			return true;
		else 
			return false;
	}
	public boolean isEmptyStack1()
	{
		if(tos1==MaxSize)
			return true;
		else 
			return false;
	}
	public boolean isEmptyStack2()
	{
		if(tos2==-1)
			return true;
		else 
			return false;
	}
	public void printStack1()
	{
		for(int i=tos1;i<MaxSize;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
	public void printStack2()
	{
		for(int i=tos2;i>-1;i--)
		{
			System.out.println(s[i]+" ");
		}
	}
	public int peekFromStack1() {
		return s[tos1];
	}
	public int peekFromStack2() {
		return s[tos2];
	}
}
public class TwoStacks {

	public static void main(String[] args) {
		Stack2 obj = new Stack2();
		System.out.println("Enter a size");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		obj.createArray(size);
		int ch;
		do
	      {
	          System.out.println("\n1.Push1\n2.Push2\n3.Pop1\n4.Pop2\n5.Peek1\n6.Peek2\n7.Print1\n8.Print2\n0.Exit\n:");
	          ch=sc.nextInt();
	          switch(ch)
	          {
	              case 1:
	                  if(obj.isStack1Full()!=true)//if(!obj.isFull())
	                  {
	                      System.out.println("Enter element:");
	                      int e=sc.nextInt();
	                      obj.pushInStack1(e);;
	                  }
	                  else
	                      System.out.println("Stack Full");
	                 break;
	              case 2:
	                  if(obj.isStack2Full()!=true)//if(!obj.isFull())
	                  {
	                      System.out.println("Enter element:");
	                      int e=sc.nextInt();
	                      obj.pushInStack2(e);;
	                  }
	                  else
	                      System.out.println("Stack Full");
	                 break;
	                 
	              case 3:
	                  if(obj.isEmptyStack1()!=true)//if(!obj.isFull())
	                  {
	                      System.out.println("element poped: "+obj.popFromStack1());
	                   }
	                  else
	                      System.out.println("Stack Empty");
	                 break;
	              case 4:
	                  if(obj.isEmptyStack2()!=true)//if(!obj.isFull())
	                  {
	                      System.out.println("element poped: "+obj.popFromStack2());
	                   }
	                  else
	                      System.out.println("Stack Empty");
	                 break;
	                 case 5:
	                  if(obj.isEmptyStack1()!=true)//if(!obj.isFull())
	                  {
	                      System.out.println("element at peek: "+obj.peekFromStack1());
	                   }
	                  else
	                      System.out.println("Stack Empty");
	                 break;
	                 case 6:
		                  if(obj.isEmptyStack2()!=true)//if(!obj.isFull())
		                  {
		                      System.out.println("element at peek: "+obj.peekFromStack2());
		                   }
		                  else
		                      System.out.println("Stack Empty");
		                 break;
	                 
	                 case 7:
	                  if(obj.isEmptyStack1()!=true)//if(!obj.isFull())
	                  {
	                      obj.printStack1();;
	                   }
	                  else
	                      System.out.println("Stack Empty");
	                 break;
	                 
	                 case 8:
		                  if(obj.isEmptyStack2()!=true)//if(!obj.isFull())
		                  {
		                      obj.printStack2();;
		                   }
		                  else
		                      System.out.println("Stack Empty");
		                 break;
	                 
	                 case 0:
	                      System.out.println("Thanks for using code... bye");
	                      break;
	                 
	                 default:
	                          System.out.println("Error in input");
	                      break;
	              }
	             
	      }while(ch!=0);
		
	}

}
