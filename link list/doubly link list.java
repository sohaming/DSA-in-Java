
class doublylinklist {
    static class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    static class doublytraversal {
        static void forward(node head) {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        static void backward(node tail) {
            node temp = tail;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        node head = new node(10);
        node second = new node(20);
        node third = new node(30);
        node tail = new node(40);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = tail;
        tail.prev = third;

        System.out.println("forward traversal");
        doublytraversal.forward(head);
        System.out.println("backward traversal");
        doublytraversal.backward(tail);
    }
}
