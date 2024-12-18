package linkedlist;

class Nodes {
    int data;
    Nodes next;

    public Nodes() {
    }

    ;

    public Nodes(int data) {
        this.data = data;
    }

    public Nodes(int data, Nodes next) {
        this.data = data;
        this.next = next;
    }
}

public class Nthnodefromend {

    static Nodes Nthnodefromend(Nodes head, int n) {
        Nodes fast = head;
        Nodes slow = head;

        // Move the fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // If the list is shorter than n nodes
            }
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast!= null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow points to the nth node from the end
        return slow;
    }

    static void printlist(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Nodes l1 = new Nodes(5, new Nodes(9, new Nodes(3, new Nodes(7, new Nodes(2, new Nodes(4))))));
        int n = 3;
        System.out.println("Given linked list is ");
        printlist(l1);
        System.out.println();
        Nodes x = Nthnodefromend(l1, n);
        if (x != null) {
            System.out.println(n + "th last element of linked list is " + x.data);
        } else {
            System.out.println("Invalid input, list is shorter than " + n + " nodes.");
        }
    }

}
