package Domain.queue;

import org.junit.jupiter.api.Test;

class LinkedQueuesTest {

    @Test
    void test1() throws QueuesException {
        LinkedQueues linkedQueues = new LinkedQueues();
        String[] array = {"(())()", "(()", "())(", "", "((()))", "(()(()))"};
        for (String i : array) {
            boolean result = isBalanced(i);
            System.out.println("Expression: " + i + " → " + (result ? "is balanced" : " not balanced"));
        }

        removeDuplicates(linkedQueues);

    }

    @Test
    void test2() {
        PriorityLinkedQueue priorityLinkedQueue = new PriorityLinkedQueue();
        try {
            priorityLinkedQueue.enQueue("Juan", 1);
            priorityLinkedQueue.enQueue("Pedro", 2);
            priorityLinkedQueue.enQueue("María", 3);
            priorityLinkedQueue.enQueue("Julio", 3);
        } catch (QueuesException e) {
            throw new RuntimeException(e);
        }
    }

    //Deja u número y remueve los repetidos(duplicados)
    public void removeDuplicates(LinkedQueues queue) {

        LinkedQueues linkedQueues = new LinkedQueues();

        for (int i = 0; i < 20; i++) {
            try {
                linkedQueues.enQueue(util.Utility.random(20));
            } catch (QueuesException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("___With duplicates" + linkedQueues);

        removeDuplicates(linkedQueues);
        System.out.println("___Without duplicates" + linkedQueues);
    }

    public boolean isBalanced(String expression) {

        LinkedQueues cola = new LinkedQueues();

        for (char character : expression.toCharArray()) {
            if (character == '(') {
                try {
                    cola.enQueue(character);
                } catch (QueuesException e) {
                    throw new RuntimeException(e);
                }
            } else if (character == ')') {
                if (cola.isEmpty()) {
                    return false; // Closing without an opening
                }
                try {
                    cola.deQueue(); // Match found, remove the opening
                } catch (QueuesException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return cola.isEmpty(); // Should be empty if all opened are closed
    }

}