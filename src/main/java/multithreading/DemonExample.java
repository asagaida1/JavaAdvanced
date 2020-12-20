package multithreading;

public class DemonExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DemonThread demonThread = new DemonThread();
        demonThread.setName("deamon_thread");
        demonThread.setDaemon(true);
        userThread.start();
        demonThread.start();

        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is demon: " + isDaemon());
        for (char i = 'A'; i < 'X'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is demon: " + isDaemon());
        for (int i = 0; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
