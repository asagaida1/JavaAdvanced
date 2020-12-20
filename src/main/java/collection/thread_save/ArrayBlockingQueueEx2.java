package collection.thread_save;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> integerArrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    integerArrayBlockingQueue.put(++i);
                    System.out.println("Producer put : " + i);
                    System.out.println(integerArrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
//Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = integerArrayBlockingQueue.take();
                    System.out.println("Consumer take : " + j);
                System.out.println(integerArrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
