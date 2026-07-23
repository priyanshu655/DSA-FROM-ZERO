
package BST;
import java.util.*;
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

    public static void PrintInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }

        if(root.data>=k1&&root.data<=k2){
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            PrintInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            PrintInRange(root.right, k1, k2);
        }else{
            PrintInRange(root.left, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printPath2Lead(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left==null&&root.right==null){
            printPath(path);
        }

        printPath2Lead(root.left, path);
        printPath2Lead(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean validBST(Node root,Node max,Node min){
        if(root==null){
            return true;
        }

        if(min!=null&&root.data<=min.data){
            return false;
        }

        if(max!=null&&root.data>=max.data){
            return false;
        }

        return validBST(root.left, root,min)&&validBST(root.right, max, root);

    }

    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }

        Node leftSubTree=createMirror(root.left);
        Node rightSubTree=createMirror(root.right);
        root.left=rightSubTree;
        root.right=leftSubTree;

        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // int values[]={5,1,3,4,2,7,11};
        // Node root=null;
        // ArrayList<Integer>path=new ArrayList<>();

        // for(int i=0;i<values.length;i++){
        //    root= insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println();
        // if(search(root, 9)){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not-Found");
        // }

        // delete(root, 5);
        // inorder(root);

        // PrintInRange(root, 5, 12);
        // System.out.println();
        // printPath2Lead(root, path);

        // if(validBST(root,null,null)){
        //     System.out.println("Valid bst");
        // }else{
        //     System.out.println("Not valid bst");
        // }

        Node root = new Node(4);

root.left = new Node(2);
root.right = new Node(6);

root.left.left = new Node(1);
root.left.right = new Node(3);

root.right.left = new Node(5);
root.right.right = new Node(7);

preOrder(root);
System.out.println();
createMirror(root);
preOrder(root);
    }
}