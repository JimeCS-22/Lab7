package Domain;

import org.junit.jupiter.api.Test;

import static Domain.LinkedQueue.isBalanced;

class LinkedQueuesTest {

    @Test
    void test1() {
        try {
            LinkedQueue linkedQueue = new LinkedQueue();
            String[] array = {"(())()", "(()", "())(", "", "((()))", "(()(()))"};
            for (String i : array) {
                boolean result = isBalanced(linkedQueue, i);
                System.out.println("Expression: " + i + " → "
                        + (result ? "is balanced " : "is not balanced "));
            }

            System.out.println();

            for (int i = 0; i < 20; i++)
                linkedQueue.enQueue(util.Utility.random(20));
            System.out.println("___With duplicates" + linkedQueue);
            removeDuplicates(linkedQueue);
            System.out.println("___Without duplicates" + linkedQueue);

        } catch (QueueException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void test2() {
        LinkedQueue linkedQueue = new LinkedQueue();
        try {
            for (int i = 0; i < 15; i++)
                linkedQueue.enQueue(util.Utility.random(30));
            System.out.println(linkedQueue);
        } catch (QueueException e) {
            throw new RuntimeException(e);
        }
    }


    private void removeDuplicates(LinkedQueue linkedQueue) throws QueueException {

        LinkedQueue aux = new LinkedQueue();

        while (!linkedQueue.isEmpty()) {
            Object currentElement = linkedQueue.deQueue();
            boolean Duplicate = false;
            int sizeAux = aux.size();

            // Verificar si currentElement ya existe en auxiliaryQueue
            for (int i = 0; i < sizeAux; i++) {
                Object auxiliaryElement = aux.deQueue();
                if (currentElement != null && currentElement.equals(auxiliaryElement)) {
                    Duplicate = true;
                } else if (currentElement == null && auxiliaryElement == null) {
                    Duplicate = true;
                }
                aux.enQueue(auxiliaryElement); // Re-encolar para mantener el contenido
            }

            // Si el elemento no se encontró en auxiliaryQueue, encolarlo
            if (!Duplicate) {
                aux.enQueue(currentElement);
            }
        }

        // Volcar los elementos únicos de la cola auxiliar a la cola original
        while (!aux.isEmpty()) {
            linkedQueue.enQueue(aux.deQueue());
        }


    }
}