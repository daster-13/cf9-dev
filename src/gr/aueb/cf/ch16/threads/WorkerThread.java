package gr.aueb.cf.ch16.threads;

public class WorkerThread {
    public class WorkerThread implements Runnable{
        @Override
        public void run() {
            for(int i= 1; i <= 10_000_000_000; i++){
                if(i == 1_000_000){
                    System.out.println("Done");
                }
            }
        }
    }
}
