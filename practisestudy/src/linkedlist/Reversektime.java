package linkedlist;

class Nodeu
{
	int data;
	Nodeu next;
	
	public Nodeu(int data)
	{
		this.data=data;
		
	}
	public Nodeu(int data,Nodeu next)
	{
		this.data=data;
		this.next=next;
	}
}
public class Reversektime {
	public static Nodeu rotateRight(Nodeu head, int k)
    {
		if (head == null || k == 0) {
            return head;
        }

        // Find the length of the linked list
        int length = 1;
        Nodeu tail = head;
        while (tail.next!= null) {
            tail = tail.next;
            length++;
        }

        // Adjust k to be within the length of the list
        k %= length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Find the node just before the split point
        Nodeu prev = head;
        for (int i = 0; i < length - k - 1; i++) {
            prev = prev.next;
        }

        // Perform the rotation
        tail.next = head; // Connect the tail to the head to form a cycle
        head = prev.next; // New head is the node after the split point
        prev.next = null; // Split the list at the split point

        return head;
        
    }
	 static void printlist(Nodeu head) 
	 {
	        Nodeu temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Nodeu list= new Nodeu(1,new Nodeu(2,new Nodeu(3,new Nodeu(4,new Nodeu(5)))));
		System.out.println("before travsing");
		printlist(list);
		//1,2,3,4,5
		System.out.println();
		Nodeu result=rotateRight(list,2);
		System.out.println("after travsing");
		printlist(result);
		//result should be 4,5,1,2,3;
		
		
	}

}
