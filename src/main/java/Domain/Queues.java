package Domain;

public interface Queues {

    public int size() throws QueuesException; // devuelve el número de elementos en la cola
    public void clear(); //elimina / inicializa la Cola
    public boolean isEmpty(); // true si la Cola está vacía
    public int indexOf(Object element) throws QueuesException; //devuelve la posicion de un elemento en la Cola
    public void enQueue(Object element) throws QueuesException; // encola un elemento por el extremo posterior(final) de la cola
    public Object deQueue() throws QueuesException; //suprime y retorna el elemento que está en la parte anterior(frente/inicio) de la cola
    public boolean contains(Object element) throws QueuesException; //true si el elemento fue encolado
    public Object peek() throws QueuesException; //devuelve el elemento que está en el frente/inicio de la Cola
    public Object front() throws QueuesException; //devuelve el elemento que está en el frente/inicio de la Cola

}
