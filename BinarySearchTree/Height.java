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

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int leftDiam=diameter(root.left);
        int rightDiam=diameter(root.right);
        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);
        int selfDiam=lh+rh+1;
        return Math.max(Math.max(leftDiam,rightDiam),selfDiam);
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

   public  static  Info diameter2(Node root){
    if(root==null){
        return new Info(0,0);
    }
    Info leftInfo=diameter2(root.left);
    Info rightInfo=diameter2(root.right);

    int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
    int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

    return new Info(diam,ht);
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

       int max_diam=diameter(root);
       System.out.println("diameter od tree is : "+max_diam);
    }
}
