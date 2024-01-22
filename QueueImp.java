import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueImp{
    LinkedList<Integer> rec = new LinkedList<Integer>();
    LinkedList<Integer> list = new LinkedList<Integer>();
    LinkedList<Integer> inter = new LinkedList<Integer>();
    Node front;
    Node rear;
    int temp;
    QueueImp(){
        front = null;
        rear = null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void dequeue(){
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(temp);
        waitingRoom(temp);
    }
    public void recep(int data){
        for(int i = 1; i <= 10;i++){
            rec.add(i);
        }
    }
    public void waitingRoom(int data){
        if(list.size()<3){
        list.add(data);
        System.out.println("waiting : "+list);
       }
        if(list.size()==2){
            int n = list.getFirst();
            interview(n);
            list.remove(n);
            System.out.println("n: "+n);
        }
    }
    public void interview(int n){
        if(inter.isEmpty()){
            inter.add(n);
            System.out.println("interview : "+inter);
            inter.clear();
        }
    }
    public void move(){
        for(int i = 1; i <= 10;i++){
            enqueue(i);
        }
    }

    public static void main(String[] args) {
        QueueImp q = new QueueImp();
        q.move();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}