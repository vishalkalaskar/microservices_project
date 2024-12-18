package linkedlist;
import java.util.HashMap;

class Nodelist {
    int data;
    Nodelist next;

    public Nodelist(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListHashTable {
    HashMap<Integer, Integer> table; // HashMap to store position and value
    Nodelist head;

    public LinkedListHashTable() {
        table = new HashMap<>();
        head = null;
    }

    // Function to insert a new node at the end of the linked list
    public void insert(int data) {
        Nodelist newNode = new Nodelist(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodelist temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        // Store the position and value in the hashtable
        table.put(getSize(), data);
    }

    // Function to get the size of the linked list
    public int getSize() {
        int size = 0;
        Nodelist temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Function to display the hashtable
    public void displayTable() {
        System.out.println("Position\tValue");
        for (int position : table.keySet()) {
            System.out.println(position + "\t\t" + table.get(position));
        }
    }

    public static void main(String[] args) {
        LinkedListHashTable list = new LinkedListHashTable();
        list.insert(5);
        list.insert(17);
        list.insert(1);
        list.insert(4);
        list.displayTable();
    }
}
