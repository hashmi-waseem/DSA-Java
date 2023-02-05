import java.util.*;
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
    public void postorder(Node root){
        if(root==null){
            return;
        }        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node front=q.element();
            q.remove();
            if(front==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }else{
                    break;
                }
            }else{
                System.out.print(front.data+" ");
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
            }
        }
    }
}
public class LevelorderTraversal{
    public static void main(String... args){
        int[] arr=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder
        BinaryTree bn=new BinaryTree();
        Node root=bn.buildTree(arr);
        bn.levelorder(root);
    }
}