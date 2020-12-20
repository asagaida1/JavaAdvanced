package multithreading;

public class Ex12Lock {
    static final Object lock1 = new Object();

    void mibileCall() {
        synchronized (lock1) {
            System.out.println(this);
            System.out.println(lock1);
            System.out.println("Mobile call starts.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends.");
        }
    }

    void skypeCall() {
        synchronized (lock1) {
            System.out.println(this);
            System.out.println(lock1);
            System.out.println("Skype call starts.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends.");
        }
    }

    void whatsappCall() {
        synchronized (lock1) {
            System.out.println(this);
            System.out.println(lock1);
            System.out.println("WhatsappCall call starts.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsappCall call ends.");
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RannableImplMobile());
        Thread thread2 = new Thread(new RannableImplSkype());
        Thread thread3 = new Thread(new RannableImplWhatsapp());
        thread1.setPriority(6);
        thread2.setPriority(5);
        thread3.setPriority(1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RannableImplMobile implements Runnable {

    @Override
    public void run() {
        new Ex12Lock().mibileCall();
    }
}

class RannableImplSkype implements Runnable {

    @Override
    public void run() {
        new Ex12Lock().skypeCall();
    }
}

class RannableImplWhatsapp implements Runnable {

    @Override
    public void run() {
        new Ex12Lock().whatsappCall();
    }
}

