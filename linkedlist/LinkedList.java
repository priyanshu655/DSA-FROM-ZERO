package linkedlist;

public  class LinkedList{

   public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        
         Node newNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
        
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

    public static void addInMiddle(int index,int data){
        if(index==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int count=0;
       while(count<index-1){
        temp=temp.next;
        count++;
       }
           newNode.next=temp.next;
           temp.next=newNode;
        }
    }

    public static int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        int val=head.data;
        size--;
        head=head.next;
        return val;
    }

    public static int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
        }else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
    int val=prev.next.data;
        prev.next=null;
        tail=prev;
        return val;
    }

    public static int seachKey(int data){
        int count=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return count;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }

    public static int RecSearch(int data){
        return helper(head,data);
    }

    public static int helper(Node head,int data){
        if(head==null){
            return -1;
        }

        if(head.data==data){
            return 0;
        }

        int idx=helper(head.next,data);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }

    public static void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void removeNthLast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
           temp= temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

        int i=1;
        int toFind=sz-n;
        Node prev=head;
        while(i<toFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
    }

    public static Node FindMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step-1 find mid
        Node midNode=FindMid();
        //step-2  reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        //check right and left half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

  
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        // l1.addFirst(2);
        // l1.addFirst(1);
        // l1.addLast(3);
        // printList();
        // l1.addFirst(0);
        // printList();
        // addInMiddle(1,1);
        // printList();
        // System.out.println(size);
        // removeFirst();
        // printList();
        // System.out.println(size);
        // System.out.println(seachKey(2));
        // System.out.println(RecSearch(2));
        // l1.addInMiddle(0,1);
        // l1.addInMiddle(1, 2);
        // l1.addInMiddle(2, 3);
        // l1.addInMiddle(3, 4);
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(3);
        printList();
        // reverse();
        // printList();
        // removeNthLast(2);
        // printList();
        System.out.println(checkPalindrome());
    }
}