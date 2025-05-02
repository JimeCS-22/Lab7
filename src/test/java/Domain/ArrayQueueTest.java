package Domain;

import Domain.queue.ArrayQueue;
import Domain.queue.QueueException;
import org.junit.jupiter.api.Test;

class ArrayQueueTest {

    @Test
    void test() {
        ArrayQueue arrayQueue = new ArrayQueue(20);
        try {
            for (int i = 0; i < 15; i++)
                arrayQueue.enQueue(util.Utility.random(30));
            System.out.println(arrayQueue);
        } catch (QueueException e) {
            throw new RuntimeException(e);
        }
    }

}