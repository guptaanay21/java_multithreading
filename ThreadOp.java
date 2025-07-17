class userThread extends Thread{
    @Override
    public void run() { //run() method
        System.out.println("Task performed...");
    }
}
public class ThreadOp {
    public static void main(String[] args){
        System.out.println("program started....");
        int x=20+30;
        System.out.println("sum is: "+ x);

        Thread t=Thread.currentThread();
        //getName() method
        String tname= t.getName();
        System.out.println("current running thread is "+ tname);

        //setName() method
        t.setName("MyMain");
        System.out.println(t.getName());

        //sleep() method
        try {
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(" throw exception");
        }
        //id() method
        System.out.println(t.getId());

        //start () method
        userThread t2=new userThread();
        t2.start();

        System.out.println("program ended....");




    }
}
