package Domain;

public interface Queues {

    public int size() throws QueuesException; // devuelve el número de elementos en la pila
    public void clear(); //remueve todos los elementos de la pila
    public boolean isEmpty(); // true si la pila está vacía
    public Object indexOf() throws QueuesException; // devuelve el elemento del tope de la pila
    public Object enQueue(Object element) throws QueuesException; // devuelve el elemento del tope de la pila
    public Object deQueue(Object element) throws QueuesException; // apila un elemento en el tope de la pila

    Object enQueue() throws QueuesException;

    Object deQueue() throws QueuesException;

    public void cointains(Object element) throws QueuesException;//desapila el elemento del tope de la pila y lo retorna
    public int peek () throws QueuesException;
    public int front() throws QueuesException;


}
