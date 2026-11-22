class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    // Node class ke andar non-static display method
    public void display() {
        Node temp = this; // here this will consider the node head node for which display is called
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {

    public static void printNode(Node head) {
        // Base Case
        if (head == null) {
            return;
        }
        System.out.print(head.data + " -> ");
        printNode(head.next);
    }

    public static int getNode(Node head, int idx) {
        // loop using to traverse at index
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Ab aap direct 'a' se puri list print kar sakte hain
        a.display(); // Output: 10->20->30->40->50->null
        printNode(a);
        System.out.println();

        System.out.println(getNode(a, 2));
    }
}