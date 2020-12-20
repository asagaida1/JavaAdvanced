package multithreading;

public class DeadLockEx {
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        Thread thread1 = new Thread(thread10);
        Thread thread2 = new Thread(thread20);
        thread1.start();
        thread2.start();
    }
}

class Thread10 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.LOCK1) {
            System.out.println("Thread10: Монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.LOCK2) {
                System.out.println("Thread10: Мониторы объектов lock1 и lock2 захвачен");
            }
        }
    }
}

class Thread20 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта lock2");
        synchronized (DeadLockEx.LOCK1) {
            System.out.println("Thread20: Монитор объекта lock2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта lock1");
            synchronized (DeadLockEx.LOCK2) {
                System.out.println("Thread20: Мониторы объектов lock1 и lock2 захвачен");
            }
        }
    }
}