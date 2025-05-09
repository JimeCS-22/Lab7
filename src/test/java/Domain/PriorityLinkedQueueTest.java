package Domain;

import Domain.queue.PriorityLinkedQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityLinkedQueueTest {

    @Test
    void test() {
        try {
            PriorityLinkedQueue priorityLinkedQueue = new PriorityLinkedQueue();
            priorityLinkedQueue.enQueue("Juan", 1); //baja
            priorityLinkedQueue.enQueue("Pedro", 2); // media
            priorityLinkedQueue.enQueue("María", 3); //alta
            priorityLinkedQueue.enQueue("Julio", 3); //alta

            System.out.println(priorityLinkedQueue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}