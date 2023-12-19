import java.util.EmptyStackException;

public class LinkedQueue<T> {
    private int counter;
    private Node<T> head;
    private Node<T> tail;
    //constructor
    LinkedQueue(){
        head = tail = null;
        counter = 0;
    }
    //operations
    //enqueue -- add - insert
    void enqueue(T element){
        Node<T> temp = new Node<>(element);
        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        counter++;
    }

    //size
    int size(){
        return counter;
    }
    //isempty
    boolean isEmpty(){
        return counter == 0;
    }
    //Dequeue -- remove
    T dequeue() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException();
        T removedElement= head.getElement();
        head = head.getNext();
        counter--;
        if(isEmpty())
            tail = null;
        return removedElement;
    }

    //first -- front element
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return head.getElement();
    }
    //printqueue
    void printQueue(){
        if(isEmpty())
            System.out.println("The queue is empty!");
        else{
            Node<T> current = head;
            while (current != null){
                System.out.println(current.getElement());
                current = current.getNext();
            }
        }
    }
}
