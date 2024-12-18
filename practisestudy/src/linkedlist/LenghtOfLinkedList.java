package linkedlist;

class Nodem
{
	int data;
	Nodem next;
	public Nodem(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class linkedmakeone
{
	Nodem head;
	void push(int newdata)
	{
		Nodem nodem=new Nodem(newdata);
		nodem.next=head;
		head=nodem;
	}
//	int lenthOFlist() {
//	    Nodem current = head;
//	    int count = 0;
//	    while (current != null) {
//	        count++;
//	        current = current.next;
//	    }
//	    return count;
//	}
	int recuersiveapp(Nodem head)
	{
		if(head==null)
		{
			return 0;
		}
		return 1+recuersiveapp(head.next);
	}
}

public class LenghtOfLinkedList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		linkedmakeone listone= new linkedmakeone();
		listone.push(10);
		listone.push(11);
		listone.push(12);
		listone.push(13);
		listone.push(14);
		listone.push(15);
		
		//System.out.println("Count of nodes is "+ listone.lenthOFlist());
		System.out.println("Count of nodes is "+ listone.recuersiveapp(listone.head));


	}

}
