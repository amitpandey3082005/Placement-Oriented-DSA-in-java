// creating node class 
class Node {
    int data;
    Node next;

    // Parameterized constructor
    Node(int data) {
        this.data = data;
    }
}

class Linkedlist {
    int size; // to maintain linkedlist size
    Node head;
    Node tail;

    // check if the list is empty
    boolean isEmpty() {
        return head == null && tail == null;
    }

    // insert at head
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        // checking if list is empty
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // connect newNode ka next head
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // insert value at tail
    void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // connect node with tail
            tail.next = newNode;
            // move tail to the new node
            tail = newNode;
        }
        size++;
    }

    // delete At head
    void delete() {
        // check list empty
        if (isEmpty())
            head = null;
        Node temp = head;
        head = temp.next;
        size--;
        // You can also use head=head.next for deleting from linkedlist at head
    }

    // function to get value at specified index
    int get(int idx) {
        // check index valid or not
        Node temp = head;
        if (idx < 0 || isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < idx; i++) {
                if (temp.next == null) { // i.e index specified is exceding the length
                    return -1;
                }
                temp = temp.next;
            }
        }
        return temp.data;
    }

    // insert element at a spefied position
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

    // display linkedlist
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Practice {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.insertAtHead(39);
        ll.delete();
        ll.insertAtPos(60, 1); // 60->20->30->null
        System.out.println(ll.get(1));
        ll.display();
    }
}
