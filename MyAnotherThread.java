    public class MyAnotherThread extends Thread{

        @Override
        public void run() {
            // Task to perform
            for (int i = 10; i >=1; i--) {
                System.out.println("another Task performed " + i);
                try {
                    Thread.sleep(2000);//wait sec then excute another task
                }catch(Exception e){
                    System.out.println("might throe exception");
                }
            }
        }

        public static void main(String[] args) {
        }
    }
