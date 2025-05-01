package Domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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