class Queue{
    int arr[];
    int size, rear, front;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=rear=-1;
    }
    public boolean isFull(){
        return front==(rear+1)%size;
    }
    public boolean isEmpty(){
        return front==rear;
    }
    public void add(int data){
        if(!isFull()){
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }else{
            System.out.println("Queue is full");
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp=arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
        return temp;
    }
    public void print(){
        for(int i=front; ; i=(i+1)%size){
            System.out.print(arr[i] + " ");
            if(i==rear){
                break;
            }
        }
        System.out.println();
    }
}
public class CircularQueueArray{
    public static void main(String... args){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.print();
        q.remove();
        q.print();
    }
}