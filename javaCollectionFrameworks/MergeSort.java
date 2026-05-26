package javaCollectionFrameworks;

public class MergeSort {
    public static void addFirst(int data){ 
         Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }
    public static Node head;
    public static Node tail;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node mergesort(Node head){
        if(head==null||head.next==null){
            return head;
        }
         
        Node midNode=getmid(head);
        Node rightHead=midNode.next;
        midNode.next=null;
       Node newleft= mergesort(head);
       Node newright= mergesort(rightHead);
        return merge(newleft,newright);
    }

    public static Node merge(Node left,Node right){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(left!=null&&right!=null){
            if(left.data<right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }

        while(left!=null){
            temp.next=left;
            temp=temp.next;
            left=left.next;
        }

          while(right!=null){
            temp.next=right;
            temp=temp.next;
            right=right.next;
        }

        return mergedLL.next;
    }
     public static void printList(){
        if(head==null){
            System.out.println("LL is empty!!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort l1=new MergeSort();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        printList();
        l1.head=l1.mergesort(l1.head);
        printList();
    }
}
