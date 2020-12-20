package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Alex", callBox);
        new Person("Serg", callBox);
        new Person("Sveta", callBox);
        new Person("Masha", callBox);
        new Person("Misha", callBox);


    }
}

class Person extends Thread {
String name;
private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }


    @Override
    public void run() {
        System.out.println(name + " Wait...");
        try {
            callBox.acquire();
            System.out.println(name + " Use phoneBox");
            Thread.sleep(2000);
            System.out.println(name+" End call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
