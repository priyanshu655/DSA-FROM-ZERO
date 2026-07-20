package BinaryTree;

import java.util.ArrayList;

public class leastAncestor {

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

    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
  path.add(root);
        if(root.data==n){
            return true;
        }

      

        boolean foundLeft=getpath(root.left, n, path);
        boolean foundRight=getpath(root.right, n, path);

        if(foundRight||foundLeft){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }


    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i;
        for(i=0;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        Node lca=path1.get(i-1);
        return lca;
    }

    public static int findDist(Node root,int n){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }

        int leftDist=findDist(root.left, n);
        int rightDist=findDist(root.right, n);

        if(leftDist==-1&&rightDist==-1){
            return -1;
        }else if(leftDist==-1){
           return rightDist+1;
        }else{
            return leftDist+1;
        }
    }

    public static int minDist(Node root,int n1,int n2){
        Node lca_curr=lca(root,n1,n2);
        int dist1=findDist(lca_curr,n1);
        int dist2=findDist(lca_curr,n2);

        return dist1+dist2;
    }

    public static int kthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }

        int leftDist=kthAncestor(root.left, n, k);
        int rightDist=kthAncestor(root.right, n, k);

        if(leftDist==-1&&rightDist==-1){
            return -1;
        }

        int max=Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(root.data);
            return root.data;
        }

        return max+1;
    }

    public static int tranformSum(Node root){
        if(root==null){
            return 0;
        }

        int leftChild=tranformSum(root.left);
        int rightChild=tranformSum(root.right);

        int data=root.data;
        int newLeft=(root.left==null)?0:root.left.data;
        int newRight=(root.right==null)?0:root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
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
//         Node root = new Node(1);

// root.left = new Node(2);
// root.right = new Node(3);

// root.left.left = new Node(4);
// root.left.right = new Node(5);

// root.right.left = new Node(6);
// root.right.right = new Node(7);

// root.left.left.left = new Node(8);

// root.right.left.right = new Node(9);


Node root = new Node(1);

root.left = new Node(2);
root.right = new Node(3);

root.left.left = new Node(4);
root.left.right = new Node(5);

root.right.left = new Node(6);
root.right.right = new Node(7);

// lca(root, 9, 7);

// System.out.println("min distance is :   "+minDist(root, 8, 3));

// kthAncestor(root, 9, 3);

tranformSum(root);
preorder(root);
    }
}
