package BST;

public class sizeOfLargeestBst {
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

    public static class Info{
        int max;
        int min;
        int size;
        boolean isBST;

        public Info(boolean isBST,int min,int max,int size){
            this.isBST=isBST;
            this.min=min;
            this.max=max;
            this.size=size;
        }
    }

    public static int maxBST=0;

    public static Info largeBST(Node root){
        if(root==null){
            return new Info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }

        Info leftInfo=largeBST(root.left);
        Info rightInfo=largeBST(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int max=Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));

        if(root.data<=leftInfo.max||root.data>=rightInfo.min){
            return new Info(false, min, max, size);
        }

        if(leftInfo.isBST&&rightInfo.isBST){
            maxBST=Math.max(maxBST,size);
            return new Info(true, min, max, size);
        }

        return new Info(false, min, max, size);
    }

    public static void main(String[] args) {
        Node root = new Node(50);

root.left = new Node(30);
root.right = new Node(60);

root.left.left = new Node(5);
root.left.right = new Node(20);

root.right.left = new Node(45);
root.right.right = new Node(70);

root.right.right.left = new Node(65);
root.right.right.right = new Node(80);

   largeBST(root);
        System.out.println(maxBST);
    }
}
