package Domain.queue;

import static org.junit.jupiter.api.Assertions.*;

class PriorityLinkedQueueTest {

    void test() {
        PriorityLinkedQueue priorityLinkedQueue = new PriorityLinkedQueue();
        try {
            priorityLinkedQueue.enQueue("Juan", 1);
            priorityLinkedQueue.enQueue("María", 3);
            priorityLinkedQueue.enQueue("Pedro", 2);
            priorityLinkedQueue.enQueue("Julio", 3);
        } catch (QueuesException e) {
            throw new RuntimeException(e);
        }
    }


}