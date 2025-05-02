package Domain.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeaderLinkedQueueTest {

    @Test
    void test1(){

        HeaderLinkedQueue headerLinkedQueue = new HeaderLinkedQueue();

        try {

            for (int i = 0; i < 15; i++) {
                headerLinkedQueue.enQueue(util.Utility.random(30));
                System.out.println(headerLinkedQueue);

            }

        }catch (QueuesException e){
            throw new RuntimeException(e);
        }


    }

    @Test
    void test2(){

        HeaderLinkedQueue headerLinkedQueue = new HeaderLinkedQueue();

        try {

            for (int i = 0; i < 15; i++) {
                headerLinkedQueue.enQueue(util.Utility.random(30));
                System.out.println(headerLinkedQueue);

            }

        }catch (QueuesException e){
            throw new RuntimeException(e);
        }


    }

    @Test
    void test3(){

        HeaderLinkedQueue q1 = new HeaderLinkedQueue();
        HeaderLinkedQueue q2 = new HeaderLinkedQueue();
        HeaderLinkedQueue q3 = new HeaderLinkedQueue();


        try {

            for (int i = 0; i < 20; i++) {

                q1.enQueue(new Climate(new Place(util.Utility.getPlace)),new Weather(util.Utility.getWeather));//hacer los métodos en utility
                System.out.println(q1);

            }

        }catch (QueuesException e){
            throw new RuntimeException(e);
        }


    }

}