class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Daemon interrupted");
            }
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        MyDaemonThread t = new MyDaemonThread();
        t.setDaemon(true); //daemon before starting
        t.start();

        System.out.println("Main thread ends.");
    }
}
