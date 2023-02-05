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
}
public class BuildBinaryTreeFromPreorder{
    public static void main(String... args){
        int[] arr=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder
        BinaryTree bn=new BinaryTree();
        Node root=bn.buildTree(arr);
        System.out.println(root.data);
    }
}