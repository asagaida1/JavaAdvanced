package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        EnterruptedThread thread = new EnterruptedThread();
        thread.start();
        thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}

class EnterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {

        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok hotyat prervat");
                System.out.println("Mi ubedilis chto sostoyanie vseh obektov normalnoe " +
                        "i reshili zavershit rabotu potoka");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("potok hotyat prervat vo vremya sna");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}

