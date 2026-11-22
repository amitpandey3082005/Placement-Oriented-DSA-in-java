// Creating Node class 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Linkedlist {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        if (head == null && tail == null)
            return true;
        else
            return false;
    }

    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void insertAtPos(int data, int pos) {
        // create new Node
        Node newNode = new Node(data);
        // if list is empty
        if (isEmpty()) {
            head = tail = newNode;
        } else if (pos == 0) {
            insertAtHead(data);
        } else if (pos == size) {
            insertAtTail(data);
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next; // connet new node withtemp.next
            temp.next = newNode; // now update temp.next with new node
        }
        size++;
    }

    // this function will return the node based on 0 index linked list
    int getNode(int idx) {
        // edge cases
        // 1. check index valid or not
        if (idx < 0 || isEmpty())
            return -1;
        else if (idx == 0)
            return head.data;
        else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                // if idx is greter than actual length of the linked list then
                if (temp.next == null) {
                    return -1;
                }
                temp = temp.next;
            }
            return temp.data;
        }
    }

    void insertAtHead(int data) {
        Node newNode = new Node(data);
        // check list empty hai ya nhi
        if (isEmpty())
            head = tail = newNode;
        else {
            newNode.next = head; // connect new node with head
            head = newNode;// move head to the newNode
        }
        size++;
    }

    void deleteAtHead() {
        // check list empty or not
        if (isEmpty())
            head = tail = null;
        head = head.next;
        if (head == null)
            tail = null; // if linkedlist will have one node after deleting it list will become
                         // empty(Both head and tail be equal to null)
        size--;
    }

    Node deleteAtPos(int x) {
        if (x < 0 || head == null) {
            return head;
        }

        if (x == 0) { // 0th index (head) delete karein
            head = head.next;
            return head;
        }

        // (x - 1)th index tak traverse karein
        Node temp = head;
        for (int i = 0; i < x - 1 && temp != null; i++) { // for 0 based (0 to pos-1) and 1-based(1 to pos-1)
            temp = temp.next;
        }

        // Out of bounds check
        if (temp == null || temp.next == null) {
            return head;
        }

        // x-th index ki node delete karein
        temp.next = temp.next.next;
        return head;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println(); // for new line
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtTail(10);
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.deleteAtHead();
        ll.display();
        ll.insertAtTail(40);
        ll.insertAtTail(50);
        ll.insertAtHead(90);
        ll.insertAtHead(100);
        ll.display();
        System.out.println(ll.getNode(4));
    }
}

