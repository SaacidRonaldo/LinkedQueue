import java.util.EmptyStackException;

public class CircularArrayQueue<T> {
    private final   static int DEFAULT_CAPACITY = 3;
    private int front , rear , count;
    private T[] queue;

    //constructors
    CircularArrayQueue(int initialCapacity){
        front=0;
        rear= 0;
        count = 0;
        queue = (T[]) new Object[initialCapacity];
    }
    CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    //operations
    //enqueue
    void enqueue(T element){
        if(size() == queue.length) //full
            expandcapacity();
        queue[rear] = element;
        rear = (rear +1) % queue.length;
        count++;
    }
    //expandcapacity
    private void expandcapacity(){
        T[] larger = (T[]) new Object[queue.length * 2];
        for(int scan =0; scan < count; scan++){
            larger[scan] = queue[front];
            front = (front +1) % queue.length;
        }
        front =0;
        rear = count;
        queue = larger;
    }
    //size
    int size(){
        return count;
    }



    //isempty
    boolean isEmpty(){
        return count == 0;
    }

    //first - front element
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return queue[front];
    }

    //dequeue
    T dequeue() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        T removedElement = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
        count--;

        return removedElement;
    }

    //printqueue
    void printQueue (){
        if(isEmpty())
            System.out.println("The queue is Empty!");
        else{
            int index = front;
            for(int i=0; i<count; i++){
                System.out.println(queue[index]);
                index = (index + 1 ) % queue.length;
            }
        }
    }


    //main method
    public static void main(String[] args) {
        CircularArrayQueue<Integer> numbers = new CircularArrayQueue<>();
        numbers.enqueue(100);
        numbers.enqueue(300);
        numbers.enqueue(400);

        System.out.println("size: " + numbers.size());
        System.out.println("isempty: " + numbers.isEmpty());
        System.out.println("front element: " + numbers.first());
        System.out.println("remove front element: " + numbers.dequeue());
        numbers.printQueue();
    }
}
