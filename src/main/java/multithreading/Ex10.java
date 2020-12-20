package multithreading;



public class Ex10 {
    public static void main(String[] args) {
        MyRunableImpl1 myRunableImpl1 = new MyRunableImpl1();
        Thread thread1 = new Thread(myRunableImpl1);
        Thread thread2 = new Thread(myRunableImpl1);
        Thread thread3 = new Thread(myRunableImpl1);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter {
    static int count = 0;
}

class MyRunableImpl1 implements Runnable {
    public synchronized void  increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }

    }
}
