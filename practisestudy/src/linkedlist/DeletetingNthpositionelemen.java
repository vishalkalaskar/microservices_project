package linkedlist;
class Nodea
{
	int data;
	Nodea next;
	public Nodea(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class linkedd
{
	Nodea head;
	void push(int newdata)
	{
		Nodea dd= new Nodea(newdata);
		dd.next=head;
		head=dd;
	}
}
public class DeletetingNthpositionelemen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
