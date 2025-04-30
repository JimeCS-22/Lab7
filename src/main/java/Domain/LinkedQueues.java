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
    public int indexOf(Object element) throws QueuesException {
        return 0;
    }


    public Object indexOf() throws QueuesException {
        return null;
    }

    @Override
     public Object deQueue() throws QueuesException {

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
    public void enQueue(Object element) throws QueuesException {

        Node newNode = new Node(element);

        if (isEmpty()){
            throw new QueuesException("Linked queues is empty");
        }
        newNode.next = rear;
        rear = newNode;
        counter ++;

    }


    @Override
      public boolean contains(Object element) throws QueuesException {

        boolean result = false;
        Node data = new Node();

        if (isEmpty()){
            throw new QueuesException("Linked queue is Empty");
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
    public Object peek() throws QueuesException {
        if (isEmpty()){
            throw new QueuesException("Linked queues is empty");
        }

        return front.data;
    }

    @Override
    public Object front() throws QueuesException {
      return peek();
    }
}
