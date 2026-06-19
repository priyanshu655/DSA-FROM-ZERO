package BinarySearchTree;

public class Height {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);
        return Math.max(lh,rh)+1;

    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    public static int sum_of_nodes(Node root){
        if(root==null){
            return 0;
        }

        int ls=sum_of_nodes(root.left);
        int rs=sum_of_nodes(root.right);
        return ls+rs+root.data;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(8);
        root.right.right.right.right=new Node(9);

       int height= heightOfTree(root);
       System.out.println("height of the tree is "+height);

       int nodeCount=count(root);
       System.out.println("total number of nodes in a tree are : "+nodeCount);

       int sumofnodes=sum_of_nodes(root);
       System.out.println("sum of all nodes are : "+sumofnodes);
    }
}
