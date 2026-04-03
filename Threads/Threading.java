package Threads;
import java.lang.Thread;
public class Threading {
    public static void main(String[] dspy){
        EmployeeTask e1 = new EmployeeTask();
        Thread t = new Thread(e1, "EmployeeThread");
        t.start();
        System.out.println(Thread.activeCount()); // get number of active threads
    }
}

class EmployeeTask implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName() + " Active Threads: " + Thread.activeCount());
    }
}


