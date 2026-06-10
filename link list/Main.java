
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Making it circular
        fourth.next = head;

        // Traversing circular linked list
        Node temp = head;

        System.out.println("Circular Linked List:");

        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
}
