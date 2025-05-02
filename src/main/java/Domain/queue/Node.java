
package Domain.queue;

public class Node {
    public Object data;
    public int priority; //1=low, 2=medium, 3=high
    public Node next; //apuntador al nodo sgte

    //Constructor
    public Node(Object data) {
        this.data = data;
        this.next = null; //puntero al sgte nodo es nulo por default
    }

    //Constructor sobrecargado 1
    public Node() {
        this.next = null; //puntero al sgte nodo es nulo por default
    }

    //Constructor sobrecargado 2
    public Node(Object element, int priority) {
        this.data = element;
        this.priority = priority;
        this.next = null; //puntero al sgte nodo es nulo por default
    }
}
