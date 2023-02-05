class LL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    private int size=-1;
    public void addFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    public void addBack(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }else if(head.next==null){
            head=null;
            size--;
            return;
        }else{
             Node temp=head;
             Node prev=head;
             while(temp.next!=null){
                prev=temp;
                temp=temp.next;
             }
             prev.next=null;
             size--;
        }
    }
    public void printLL(){
        while(head!=null){
            System.out.print(head.data + "  ");
            head=head.next;
        }
        System.out.println();
    }
    public int getSize(){
        return this.size+1;
    }
}
public class LinkedListImplementation{
    public static void main(String... args){
        LL head=new LL();
        head.addFront(1);
        head.addFront(2);
        head.addFront(3);
        head.addBack(0);
        head.addBack(-1);
        head.addBack(-2);
        head.deleteLast();
        head.printLL();
        int s=head.getSize();
        System.out.println(s);
    }
}