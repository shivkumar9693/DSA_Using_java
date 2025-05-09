import java.util.Scanner;

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

    // remove first
    public static int removeFirst() {
        if (size == 0) {
            System.out.println("Empty list");
            return 0;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public static void removeLast() {
        if (size == 0) {
            System.out.println("empty list");
            return;
        }
        if (size == 1) {
            head = tail = null;
            return;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // remove from middle
    public static Node removeMiddle() {
        if (size == 0) {
            System.out.println("empty list");
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return prev;
    }

    // remove element from first
    public static void removeFromFirst(int index) {
        if (index == size) {
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
    }

    // serach element in linked list
    public static int searchElement(int key) {
        if (size == 0) {
            System.out.println("Element Not Found");
            return 0;
        }
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.print("Element found at index ");
                return i;
            }
            temp = temp.next;
            i++;
        }
        return 0;

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
        Scanner sc = new Scanner(System.in);
        // User Input for Linked list
        // System.out.println("Eneter the size of linked list");
        // int size = sc.nextInt();
        // while (size > 0) {
        // l.addEnd(sc.nextInt());
        // size--;
        // }
        // __________________________________________________
        l.addFrist(1);
        l.addFrist(2);
        l.addEnd(3);
        l.addEnd(5);
        l.addMiddle(6);
        // _______________________________________
        // l.removeFromFirst(2);
        // l.removeFirst();
        // l.removeLast();
        // removeMiddle();
        // _______________________________________
        l.print();
        // System.out.println(l.searchElement(5));

    }
}
