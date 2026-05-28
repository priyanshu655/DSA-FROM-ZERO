package stack;

public class stackUsingLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        public static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        // System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
