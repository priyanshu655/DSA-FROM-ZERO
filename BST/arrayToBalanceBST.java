package BST;
import java.util.*;

public class arrayToBalanceBST{
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

    public static Node BalancedBST(int arr[],int si,int ei){
        if(si>ei){
            return null;
        }

        int mid=(ei+si)/2;
        Node root=new Node(arr[mid]);
        root.left=BalancedBST(arr, si, mid-1);
        root.right=BalancedBST(arr, mid+1, ei);

        return root;

    }


    public static void preorder(Node root){
        if(root==null){
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }



    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root=BalancedBST(arr, 0, 6);
        preorder(root);
    }
}