package DoublyLL;

public class DoublyLL {
    public static class Node{
        int data;
        Node prev=null;
        Node next=null;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        newNode.prev=head;
        head=newNode;
    }
    public void printList(){
        Node temp=head;
        if(temp==null){
            System.out.println("DLL is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty!!");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        return val;
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printList();
        dll.removeFirst();
        dll.printList();
        dll.addFirst(1);
        dll.reverse();
        dll.printList();
    }
}
