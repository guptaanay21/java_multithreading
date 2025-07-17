public class MyThread implements Runnable {

    @Override
    public void run() {
        // Task to perform
        for (int i = 0; i < 10; i++) {
            System.out.println("Task performed " + i);
            try {
                Thread.sleep(1000);//wait sec then excute another task
            }catch(Exception e){
                System.out.println("might throe exception");
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thr = new Thread(t);

        MyAnotherThread t2=new MyAnotherThread();
        thr.start();
        t2.start();
    }
}
