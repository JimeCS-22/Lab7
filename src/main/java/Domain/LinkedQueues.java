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

    @Override
    public int size() throws QueuesException {

        if (isEmpty()){
            throw new QueuesException("Linked queues is empty");
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


        return true;
    }

    @Override
    public Object indexOf() throws QueuesException {
        return null;
    }

    @Override
    public Object enQueue(Object element) throws QueuesException {
        return null;
    }

    @Override
    public Object deQueue(Object element) throws QueuesException {
        return null;
    }

    @Override
    public Object enQueue(Object element) throws QueuesException {

        Node newNode = new Node(element);

        if (isEmpty()){
            throw new QueuesException("Linked queues is empty");
        }
        newNode.next = rear;
        rear = newNode;
        counter ++;


    }

    @Override
    public Object deQueue() throws QueuesException {
        int result;

        if (isEmpty()){
            throw new QueuesException("Linked queues is Empty");
        }
        result = (int) front.data;
        front = front.data;
        counter--;

        return result;

    }

    @Override
    public void cointains(Object element) throws QueuesException {

    }

    @Override
    public int peek() throws QueuesException {
        if (isEmpty()){
            throw new QueuesException("Linked queues is empty");
        }

        return (int) front.data;
    }

    @Override
    public int front() throws QueuesException {
        if (isEmpty()){
            throw new QueuesException("Linked queues is empty");
        }

        return (int) front.data;
    }
}
