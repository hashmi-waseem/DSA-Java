class Queue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front=null;
    Node rear=null;
    public boolean isEmpty(){
        return front==null && rear==null;
    }
    public void add(int data){
        Node temp=new Node(data);
        if(rear==null){
            front=rear=temp;
        }else{
            rear.next=temp;
            rear=temp;
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int temp=front.data;
        front=front.next;
        return temp;
    }
    public void print(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class QueueImplementationLinkedList{
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.print();
		q.remove();
		q.remove();
		q.print();
	}
}