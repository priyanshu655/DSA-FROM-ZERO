package BST;
import java.util.*;

public class bstToBalancedBST {
     public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void inorderOfBST(ArrayList<Integer> inorder,Node root){
        if(root==null){
            return;
        }

        inorderOfBST(inorder, root.left);
        inorder.add(root.data);
        inorderOfBST(inorder, root.right);
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }



    public static Node createBST(ArrayList<Integer> inorder,int si,int ei){
        if(si>ei){
            return null;
        }

        int mid=(ei+si)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder, si, mid-1);
        root.right=createBST(inorder, mid+1, ei);

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(6);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(2);
        ArrayList<Integer> inorder=new ArrayList<>();
        inorderOfBST(inorder, root);

        root=createBST(inorder, 0, inorder.size()-1);
        preorder(root);
    }
}
