package BST;

import BinaryTree.inorder;

public class bst_insertion{
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

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left,val);
        }

        if(root.data<val){
            root.right=insert(root.right,val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int val){
        if(root==null){
            return false;
        }

        if(root.data==val){
            return true;
        }

        if(root.data<val){
            return search(root.right, val);
        }else{
            return search(root.left, val);
        }
    }

    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }
        if(root.data<val){
            root.right=delete(root.right,val);
        }else{
            if(root.left==null&&root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
return root;
        
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }

        return root;
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
           root= insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        if(search(root, 9)){
            System.out.println("Found");
        }else{
            System.out.println("Not-Found");
        }

        delete(root, 5);
        inorder(root);
    }
}