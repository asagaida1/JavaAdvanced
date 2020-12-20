package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolex2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnubleImp200());
//        }
//    scheduledExecutorService.schedule(new RunnubleImp200(), 3, TimeUnit.SECONDS);
//    scheduledExecutorService.shutdown();

//        scheduledExecutorService.scheduleAtFixedRate(new RunnubleImp200(),3,1,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnubleImp200(), 3,1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();

    }

}

class RunnubleImp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begins work");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + "Main ends");
    }
}
