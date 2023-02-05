class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    int idx=-1;
    public Node buildTree(int[] arr){
        idx++;
        if(arr[idx]==-1){
            return null;
        }
        Node newNode=new Node(arr[idx]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
public class InorderTraversal{
    public static void main(String... args){
        int[] arr=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder
        BinaryTree bn=new BinaryTree();
        Node root=bn.buildTree(arr);
        bn.inorder(root);
    }
}