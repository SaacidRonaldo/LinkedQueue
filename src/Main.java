public class Main {
    public static void main(String[] args) {
 LinkedQueue<String> address = new LinkedQueue<>();
 address.enqueue("Hodan");
 address.enqueue("Howlwadaag");
 address.enqueue("waaberi");
 address.printQueue();
        System.out.println("size: " + address.size());
        System.out.println("removed element: " + address.dequeue());
        System.out.println("Front element: " + address.first());
        System.out.println("isEmpty: " + address.isEmpty());

        System.out.println("TEST");
    }
}