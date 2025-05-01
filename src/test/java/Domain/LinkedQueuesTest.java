package Domain;

import org.junit.jupiter.api.Test;

import static Domain.LinkedQueue.isBalanced;

class LinkedQueuesTest {

    @Test
    void test1(){
        try {
            LinkedQueue linkedQueue = new LinkedQueue();
            String[] array = {"(())()", "(()", "())(", "", "((()))", "(()(()))"};
            for (String i : array) {
                boolean result = isBalanced(linkedQueue, i);
                System.out.println("Expression: " + i + " → "
                        + (result ? "is balanced " : "is not balanced "));
            }

            for (int i = 0; i < 20; i++)
                linkedQueue.enQueue(util.Utility.random(20));
            System.out.println("___With duplicates" + linkedQueue);
           // removeDuplicates(linkedQueue);
            //System.out.println("___Without duplicates" + linkedQueue);

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

}