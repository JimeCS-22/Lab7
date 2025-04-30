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

        return counter == 0 && front==null && rear == null;
    }

    @Override
    public Object indexOf() throws QueuesException {
        return null;
    }


    @Override
    public Object deQueue(Object element) throws QueuesException {

        int result;

        if (isEmpty()){
            throw new QueuesException("Linked queues is Empty");
        }
        result = (int) front.data;
        front = front.next;
        counter--;

        return result;
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


        return element;
    }


    @Override
    public boolean cointains(Object element) throws QueuesException {

        boolean result = false;
        Node data = new Node();

        if (isEmpty()){
            throw new QueuesException("Linked queue is Empty");
        }


        LinkedQueues aux = new LinkedQueues(data);

        while (!isEmpty()){

            aux.enQueue(peek());

            if (aux.data == element){
                result = true;
            }
        }

        while (!aux.isEmpty()){

            enQueue(aux.peek());

        }

        return result;

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
