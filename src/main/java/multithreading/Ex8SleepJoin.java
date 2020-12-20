package multithreading;

public class Ex8SleepJoin extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Ex8SleepJoin thread2 = new Ex8SleepJoin();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Konec!");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
