package linkedlist;

class Nodee
{
	int data;
	Nodee next;
	public Nodee(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class linkedq
{
	Nodee head;
	void push(int newdata)
	{
		Nodee ee=new Nodee(newdata);
        ee.next=head;
        head=ee;
		
	}
	void deleteatEnd()	
	{
		Nodee temp = head;
		if(head==null||head.next==null)
		{
			head=null;
			return;
		}
		while(temp.next.next !=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	void print()
	{
		Nodee temp =head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
}
public class DeletefromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedq listone= new linkedq();
		listone.push(10);
		listone.push(11);
		listone.push(12);
		listone.push(13);
		listone.push(14);
		listone.push(15);
		
		listone.print();
		listone.deleteatEnd();
		listone.print();
	}

}
