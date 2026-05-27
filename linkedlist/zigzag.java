package linkedlist;

public class zigzag{

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

    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static Node findMid() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node reverseList(Node h) {
        Node prev = null;
        Node curr = h;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void zigZag() {

        // Step 1: Find Mid
        Node mid = findMid();

        // Step 2: Split
        Node head2 = mid.next;
        mid.next = null;

        // Step 3: Reverse second half
        head2 = reverseList(head2);

        // Step 4: Merge alternately
        Node temp = head;
        Node temp2 = head2;

        Node dummy = new Node(0);
        Node temp3 = dummy;

        while (temp != null && temp2 != null) {

            temp3.next = temp;
            temp3 = temp3.next;
            temp = temp.next;

            temp3.next = temp2;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }

        while (temp != null) {
            temp3.next = temp;
            temp3 = temp3.next;
            temp = temp.next;
        }

        while (temp2 != null) {
            temp3.next = temp2;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }

        head = dummy.next;
    }

    public static void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);

        System.out.println("Original List:");
        printList();

        zigZag();

        System.out.println("Zig Zag List:");
        printList();
    }
}