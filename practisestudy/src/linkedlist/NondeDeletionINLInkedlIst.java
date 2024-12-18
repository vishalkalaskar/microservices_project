package linkedlist;
class Nodeo
{
	int data;
	Nodeo next;
	public Nodeo(int data)
	{
		this.data=data;
		this.next=null;
		
	}
}

class LinkedM
{
	Nodeo head;
	void push(int newdata)
	{
		Nodeo lo=new Nodeo(newdata);
		lo.next=head;
		head=lo;
		
	}
	void deletingatBegining()
	{
		if (head != null) {
            Nodeo current = head;
            head = current.next;
            current.next = null;
        }
		
	}
	void print()
	{
		Nodeo cu =head;
		while(cu !=null)
		{
			System.out.println(cu.data+" ");
			cu=cu.next;
		}
		System.out.println();
	}
	
	
}
public class NondeDeletionINLInkedlIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedM dm=new LinkedM();
		dm.push(1);
		dm.push(2);
		dm.push(3);
		dm.push(4);
		dm.push(5);
		
		System.out.print("Linked list before deletion: ");
        dm.print();
        dm.deletingatBegining();
        System.out.print("Linked list after deletion: ");
        dm.print();
		

	}

}
