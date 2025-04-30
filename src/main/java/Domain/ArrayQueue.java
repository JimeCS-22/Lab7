package Domain;

public abstract class ArrayQueue implements Queues{

    private Object[] queue;
    private int n ;
    private int front;
   private int rear;

    @Override
    public int size() throws QueuesException {

        if (isEmpty()){
            throw new QueuesException("Array queue is empty");
        }
        return rear - front;
    }

    @Override
    public void clear() {

        queue = new Object[n];
        front = rear = n-1;


    }

    @Override
    public boolean isEmpty() {

        return front == rear;
    }

    @Override
    public Object indexOf() throws QueuesException {
        return null;
    }

    @Override
    public void enQueue(Object element) throws QueuesException {

        if(size()==queue.length){

            throw new QueuesException("Array queue is empty");
        }

        for(int i = front; i<rear; i++){

            queue[i]=queue[i+1];
        }
        queue[rear] = element;
        front--;

    }

    @Override
    public Object deQueue(Object element) throws QueuesException {
        if (isEmpty()){
            throw new QueuesException("Array queue is Empty");

        }

        return queue[++front];
    }

    @Override
    public boolean cointains(Object element) throws QueuesException {

        return false;
    }

    @Override
    public int peek() throws QueuesException {

        if (isEmpty()){

            throw new QueuesException("Array queue is empty");
        }
        return (int) queue[front+1];
    }

    @Override
    public int front() throws QueuesException {

        if (isEmpty()){

            throw new QueuesException("Array queue is empty");
        }

        return (int) queue[front+1];
    }
}
