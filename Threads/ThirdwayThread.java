package Threads;
import java.lang.Thread;
public class ThirdwayThread {
    public static void main(String[] dspy) throws InterruptedException{
        Runnable r1 = () -> {
            for(int i=0; i<5; i++){
                //System.out.println("Hello Employeee" +"Thread Name: " + Thread.currentThread().getName() + " Active Threads: " + Thread.currentThread().getId());
            }
        };
         Runnable r2 = () -> {
             for(int i=0; i<5; i++){
                 //System.out.println("Hi Manager" +"Thread Name: " + Thread.currentThread().getName() + " Active Threads: " + Thread.currentThread().getId());
             }
         };

         Thread t1 = new Thread(r1, " Employee Thread"); 
         Thread t2 = new Thread(r2, " Manager Thread");
         System.out.println(" T1 State: " +t1.getState());

         t1.start();
         //t1.join();
         System.out.println(" T1 State: " +t1.getState());
         t1.sleep(1000);

         t2.start();
        System.out.println(" T1 State: " + t1.getState());

         System.out.println(" Active Threads: " + Thread.activeCount()); // get number of active threads
    }
}


/*
     0 - New
     1 - Runnable
     2 - Blocked
     3 - Timed Waiting(join)
     4 -  Waiting(specific time/sleep)
     5 - Terminated
*/