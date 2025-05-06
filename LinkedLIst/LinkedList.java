public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // add first
    public static void addFrist(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // add from end
    public static void addEnd(int data) {
        Node newNode = new Node(data);
        if (size < 1) {
            tail = head = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // add in middle
    public static void addMiddle(int data) {
        if (size < 1) {
            head = new Node(data);
            size++;
            return;
        }
        Node slow = head;
        Node fast = head;
        Node newNode = new Node(data);
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
        size++;
    }

    // print
    static void print() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFrist(1);
        l.addFrist(2);
        l.addEnd(3);
        l.addEnd(5);
        l.addMiddle(6);
        l.print();
    }
}
