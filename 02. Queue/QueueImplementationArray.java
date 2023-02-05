class Queue{
    int[] arr;
    int size;
    int rear;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        rear=-1;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear==size-1){
            return;
        }else{
            rear++;
            arr[rear]=data;
        }
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }else{
            int temp=arr[0];
            for(int i=1; i<arr.length; i++){
                arr[i-1]=arr[i];
            }
            rear--;
            return temp;
        }
    }
    public void print(){
        for(int i=0; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class QueueImplementationArray
{
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.print();
		q.remove();
		q.add(3);
		System.out.println(q.isEmpty());
		q.print();
	}
}