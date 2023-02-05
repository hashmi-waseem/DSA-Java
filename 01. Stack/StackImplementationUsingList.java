import java.util.ArrayList;
class Stack{
    ArrayList<Integer> list=new ArrayList<>();
    public boolean isEmpty(){
        return list.size()==0;
    }
    public void push(int data){
        list.add(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int temp=list.get(list.size()-1);
        list.remove(list.size()-1);
        return temp;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
    }
}
public class StackImplementationUsingList{
    public static void main(String... args){
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        s.print();
        System.out.println(s.peek());
    }
}