package multithreading;

public class VolatileEx extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);
    }


    public static void main(String[] args) throws InterruptedException {
        VolatileEx thred1 = new VolatileEx();
        thred1.start();
        Thread.sleep(3000);
        System.out.println("After three secondes it is time to wake up");
        thred1.b=false;
        thred1.join();
        System.out.println("End of programm");
    }
}


