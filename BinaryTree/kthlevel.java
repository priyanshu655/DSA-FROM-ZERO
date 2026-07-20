package BinaryTree;

public class kthlevel {
    public static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static void kth_level(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
        }

        kth_level(root.left, level+1, k);
        kth_level(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);

root.left.left = new Node(4);
root.left.right = new Node(5);

root.right.left = new Node(6);
root.right.right = new Node(7);

kth_level(root, 1, 2);
    }
}
