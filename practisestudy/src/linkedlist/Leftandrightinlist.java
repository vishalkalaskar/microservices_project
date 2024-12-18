package linkedlist;

class Nodelista
{
	int data;
	Nodelista next;
	
	public Nodelista(int data)
	{
		this.data=data;
	}
	public Nodelista(int data,Nodelista next)
	{
		this.data=data;
		this.next=next;
	}
}
public class Leftandrightinlist {
	
	Nodelista head;
	public static Nodelista[] leftandrigheleoflist(Nodelista head,int x)
	{
		Nodelista[] result = new Nodelista[2];
        result[0] = null; // Initialize left element to null (if not found)
        result[1] = null;
        
		Nodelista left=null;
		Nodelista current=head;
		
		while(current!=null)
		{
			
			if (current.data == x) {
                // If current node's data matches x, set the right element
                    result[1] = current.next;
                // Set the left element (previous node)
                result[0] = left;
                break;
            }
			left=current;
	        current=current.next;
		}
		
		
		return result;
	}
	
	static void printlist(Nodelista head)
	{
		Nodelista temp =head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodelista l1 = new Nodelista(5, new Nodelista(9, new Nodelista(3, new Nodelista(7, new Nodelista(2, new Nodelista(4))))));
		printlist(l1);
        System.out.println();
        int y = 7;
        Nodelista[] elements = leftandrigheleoflist(l1, y);
        System.out.println(y + " right element is " + (elements[1] != null ? elements[1].data : "null") + " left element is " + (elements[0] != null ? elements[0].data : "null"));
	}

}
