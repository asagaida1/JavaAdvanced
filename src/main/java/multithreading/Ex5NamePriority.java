package multithreading;

public class Ex5NamePriority {
    public static void main(String[] args) {
        Thread myThread5 = new Thread(new MyThread5());
//        Thread myThread6 = new Thread(new MyThread6());

        myThread5.setName("ThisIsMyThread5!!!");
        myThread5.setPriority(9);
        System.out.println("Name of myThread5 = " + myThread5.getName() + " Priority of myThread5 = " + myThread5.getPriority());
//        System.out.println("Name of myThread5 = " + myThread6.getName() + " Priority of myThread5 = " + myThread6.getPriority());
        myThread5.start();
//        myThread6.start();
    }
}

class MyThread5 implements Runnable {
    @Override
    public void run() {
        System.out.println("privet");
    }
}

//class MyThread6 implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("poka");
//    }
//}
