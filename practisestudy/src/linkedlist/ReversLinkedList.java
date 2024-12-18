package linkedlist;

class Noden {
    int data;
    Noden next;

    public Noden(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedn {
    Noden head;

    void push(int newdata) {
        Noden noden = new Noden(newdata);
        noden.next = head;
        head = noden;
    }
   
    Noden reverse(Noden head) {
    	 Noden prev=null;
    	 Noden current=head;
        if (head == null || head.next == null) {
            return head;
        }
//        Noden rest = reverse(head.next);
//        head.next.next = head;
//        head.next = null; // Set the next of the current head to null to avoid circular reference
//        return rest;
       while(current!=null)
    	   {
    	   Noden nextNode = current.next;
           current.next=prev;
           prev=current;
           current=nextNode;
    	   }
        return prev;
        

        
    }

    void print() {
        Noden current = head;
        while (current != null) {
            System.out.print(current.data + " "); // Changed println to print to print in the same line
            current = current.next;
        }
        System.out.println(); // Added to print a newline after printing the list
    }
}

public class ReversLinkedList {
    public static void main(String[] args) {
        linkedn lin = new linkedn();
        lin.push(1);
        lin.push(2);
        lin.push(3);
        lin.push(4);
        lin.push(5);

        System.out.print("Original list: ");
        lin.print();
        lin.head = lin.reverse(lin.head); // Update head with the reversed list
        System.out.print("Reversed list: ");
        lin.print();
    }
}
