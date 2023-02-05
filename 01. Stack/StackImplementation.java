class Stack{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    public boolean isEmpty(){
        return top==null;
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }
    public void print(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class StackImplementation{
    public static void main (String ... args){
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println("Popped element : "+s.pop());
        s.print();
        System.out.println("Top Element is : " + s.peek());
        System.out.println(s.isEmpty());
    }
}