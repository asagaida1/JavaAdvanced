package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Personal market came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everyThinkIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("EveryThing is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Marked is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Alex", countDownLatch);
        new Friend("Misha", countDownLatch);
        new Friend("Sveta", countDownLatch);
        new Friend("Olya", countDownLatch);
        new Friend("Egor", countDownLatch);

        System.out.println("Start three methods.");

        marketStaffIsOnPlace();
        everyThinkIsReady();
        openMarket();

        System.out.println("After started three methods");

    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " Start buy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
