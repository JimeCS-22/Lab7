package Domain;

public class ArrayQueue implements Queues{

    private Object[] queue;
    private int n ;
    private int front;
    private int rear;



    @Override
    public int size() throws QueueException {

        if (isEmpty()){
            throw new QueueException("Array queue is empty");
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
    public int indexOf(Object element) throws QueueException {

        if (isEmpty()) {
            throw new QueueException("Array queue is empty");
        }

        int index = -1;
        int currentIndex = 0;
        int originalSize = size();

        // Simulate iteration by cycling through the queue
        while (currentIndex < originalSize) {
            Object currentElement = deQueue();
            enQueue(currentElement); // Cycle to the back

            if ((element == null && currentElement == null) || (element != null && element.equals(currentElement))) {
                index = currentIndex;
                break; // Found the first occurrence, we can stop cycling
            }
            currentIndex++;
        }

        // After the loop, the queue's front has moved.

        return index;

    }

    @Override
    public void enQueue(Object element) throws QueueException {

        if(size()==queue.length){

            throw new QueueException("Array queue is empty");
        }

        for(int i = front; i<rear; i++){

            queue[i]=queue[i+1];
        }
        queue[rear] = element;
        front--;


    }

    @Override
    public Object deQueue() throws QueueException {

        if (isEmpty()){
            throw new QueueException("Array queue is Empty");

        }

        return queue[++front];



    }

    @Override
    public boolean contains(Object element) throws QueueException {
        return false;
    }

    @Override
    public Object peek() throws QueueException {

        if (isEmpty()){

            throw new QueueException("Array queue is empty");
        }
        return queue[front+1];


    }

    @Override
    public Object front() throws QueueException {
        return peek();
    }
}
