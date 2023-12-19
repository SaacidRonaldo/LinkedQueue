public class Node<T> {
    private T element;
    private Node<T> next;
    Node(T element){
        this.element = element;
        next = null;
    }

    //properties

    public Node<T> getNext() {
        return next;
    }

    public T getElement() {
        return element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
