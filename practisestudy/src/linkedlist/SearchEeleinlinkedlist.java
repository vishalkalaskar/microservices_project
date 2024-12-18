package linkedlist;

class Nodet
{
	int data;
	Nodet next;
	
	public Nodet(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Linkedmake
{
	Nodet head;
	
    public void push(int newdata)
	{
		Nodet newnode=new Nodet(newdata);
		
		newnode.next=head;
		head=newnode;
	}
    
//    public boolean search(Nodet head,int x)
//    {
//    	Nodet current=head;
//    	while(current != null)
//    	{
//    		if(current.data ==x)
//    		{
//    			return true;
//    	       
//    		}
//    		current=current.next;
//    	}
//    	return false;
//    }
    boolean search(Nodet head,int x)
    {
    	if (head==null)
    	{
    		return false;
    		
    	}
    	if(head.data ==x)
    	{
    		return true;
    	}
    	
		return search(head.next,x);
    	
    }
    
}


public class SearchEeleinlinkedlist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Linkedmake llist = new Linkedmake();
		int x=21;
		llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
        if(llist.search(llist.head, x))
        {
        	System.out.println("yes");
        }
        else 
        {
        	System.out.println("no");
        }

	}

}
