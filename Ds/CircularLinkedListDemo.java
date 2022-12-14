import java.util.Scanner;

class Node 
{
    int data;
    Node next;

    Node(int data) 
    {
        this.data = data;
        next = null;
    }
}

public class CircularLinkedListDemo {
    Node root,root1, last,last1;

    void createLinkedList() 
    {
        root = last = null;
        root1 = last1 = null;
    }
    
    void insertRight(int data) 
    {
        Node n = new Node(data);

        	if(data%2==0) 
        	{
                if (root == null) {
                    root = last = n;
                    last.next = root;
                } else {
                    last.next = n;
                    last = n;
                    last.next = root;
                }
        	}
        	else
        	{
                if (root1 == null) {
                    root1 = last1 = n;
                    last1.next = root1;
                } else {
                    last1.next = n;
                    last1 = n;
                    last1.next = root1;
                }
        	}
  }
    
    
 

    void printListEven() {
        if (root == null) {
            System.out.println("List Empty");
        } else {
        	System.out.println("Even List");
            Node t;
            t = root;
            do {
                System.out.println(t.data);
                t = t.next;
            } while (t != root);
        }
    }
    
    void printListOdd() {
        if (root1 == null) {
            System.out.println("List Empty");
        } else {
        	System.out.println("Odd List");
            Node t;
            t = root1;
            do {
                System.out.println(t.data);
                t = t.next;
            } while (t != root1);
        }
    }
    

  
    
	void mergeList() {
		if(root==null && root1==null) {
			System.out.println("Cann't do merging");
		}
		else
		{
			last.next=root1;
			last=last1;
			last.next=root;
		}
	}
    
	
	void printMergeList() {
		if(root1==null)
			System.out.println("List is Empty");
		else {
			System.out.println("MegerdList");
			Node t=root1;
			do {
				System.out.println(t.data);
				t=t.next;
			}while(t!=root1);
		}
	}
    
    
    
    
    
    
    
    public static void main(String args[]) {
        int ch, e;
        var obj = new CircularLinkedListDemo();
        
        Scanner in = new Scanner(System.in);
        obj.createLinkedList();
        do {
            System.out.println("1.Insert Right\n2.Print List Even\n3.Print List Odd\n4.Merg List\n5.Print Merge List  \n0.ToEnd");
            ch = in.nextInt();
            switch (ch) {
              
                case 1:
                    System.out.println("Enter Data:");
                    e = in.nextInt();
                    obj.insertRight(e);
                    System.out.println("Added");
                    break;
                   
                case 2:
                    obj.printListEven();
                    break;
                    
                case 3:
                    obj.printListOdd();
                    break;
                    
                case 4:
                    obj.mergeList();
                    break;
                    
                case 5:
                    obj.printMergeList();
                    break;


                case 0:
                    System.out.println("Exiting ");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
        in.close();
    }
}
