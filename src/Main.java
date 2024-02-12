

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread("T1");
        MyThread myThread2 = new MyThread("T2");
        MyThread myThread3 = new MyThread("T3");
        try {
            myThread3.start();
            myThread3.join();
            myThread2.start();
            myThread2.join();
            myThread1.join();
            myThread1.start();
        } catch (Exception exception) {
        }
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Run" + name);
    }
}