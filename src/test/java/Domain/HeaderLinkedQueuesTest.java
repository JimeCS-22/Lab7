package Domain;

import org.junit.jupiter.api.Test;

class HeaderLinkedQueuesTest {

    @Test
    void test1(){
        try {
            HeaderLinkedQueue q1 = new HeaderLinkedQueue();
            HeaderLinkedQueue q2 = new HeaderLinkedQueue();
            HeaderLinkedQueue q3 = new HeaderLinkedQueue();

            for (int i = 0; i <20 ; i++)
                q1.enQueue(new Climate(new Place(util.Utility.getPlace()),
                        new Weather(util.Utility.getWeather())));
            System.out.println(q1);

        } catch (QueueException e) {
            throw new RuntimeException(e);
        }
    }

    void test2() {
        HeaderLinkedQueue headerLinkedQueue = new HeaderLinkedQueue();
        try {
            for (int i = 0; i < 15; i++)
                headerLinkedQueue.enQueue(util.Utility.random(30));
            System.out.println(headerLinkedQueue);
        } catch (QueueException e) {
            throw new RuntimeException(e);
        }
    }
}