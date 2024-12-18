package linkedlist;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a node after a given node
    void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        // Create a new node with the given data
        Node newNode = new Node(newData);

        // Set the next pointer of the new node to the next node of the given node
        newNode.next = prevNode.next;

        // Set the next pointer of the given node to the new node
        prevNode.next = newNode;
    }

    // Method to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InsertionAfterNode {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList myList = new LinkedList();

        // Insert some nodes into the linked list
        myList.head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);

        // Link the nodes together
        myList.head.next = secondNode;
        secondNode.next = thirdNode;

        // Print the linked list before insertion
        System.out.print("Linked list before insertion: ");
        myList.printList();

        // Insert a node with value 25 after the second node
        myList.insertAfter(secondNode, 25);

        // Print the linked list after insertion
        System.out.print("Linked list after insertion: ");
        myList.printList();
    }
}

