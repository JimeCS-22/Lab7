package Domain;

public class LinkedQueues implements Queues{

    private Node front;
    private Node rear;
    private int counter;

    public LinkedQueues(Node front, Node rear, int counter) {
        this.front = front;
        this.rear = rear;
        this.counter = counter;
    }

    public LinkedQueues() {
    }

    @Override
    public int size() throws QueueException {

        if (isEmpty()){

            throw new QueueException("Array queue is empty");

        }
        return counter;
    }

    @Override
    public void clear() {

        front = rear = null;
        counter = 0;

    }

    @Override
    public boolean isEmpty() {

        return counter == 0 && front==null && rear == null;

    }

    @Override
    public int indexOf(Object element) throws QueueException {
        return 0;
    }

    @Override
    public void enQueue(Object element) throws QueueException {

        Node newNode = new Node(element);

        if (isEmpty()){
            throw new QueueException("Linked queues is empty");
        }
        newNode.next = rear;
        rear = newNode;
        counter ++;


    }

    @Override
    public Object deQueue() throws QueueException {

        int result;

        if (isEmpty()){
            throw new QueueException("Linked queues is Empty");
        }
        result = (int) front.data;
        front = front.next;
        counter--;

        return result;

    }

    @Override
    public boolean contains(Object element) throws QueueException {

        boolean result = false;
        Node data = new Node();

        if (isEmpty()){
            throw new QueueException("Linked queue is Empty");
        }


        LinkedQueues aux = new LinkedQueues();

        while (!isEmpty()){

            aux.enQueue(deQueue());

            if (aux.rear == element){
                result = true;
            }
        }

        while (!aux.isEmpty()){

            enQueue(deQueue());

        }

        return result;
    }

    @Override
    public Object peek() throws QueueException {

        if (isEmpty()){
            throw new QueueException("Linked queues is empty");
        }

        return front.data;


    }

    @Override
    public Object front() throws QueueException {

        return peek();

    }

    public static boolean isBalanced(String expression) throws QueueException {
        LinkedQueues cola = new LinkedQueues();

        for (char character : expression.toCharArray()) {
            if (character == '(') {
                cola.enQueue(character);
            } else if (character == ')') {
                if (cola.isEmpty()) {
                    return false; // Closing without an opening
                }
                cola.deQueue(); // Match found, remove the opening
            }
        }
        return cola.isEmpty(); // Should be empty if all opened are closed
    }
}
