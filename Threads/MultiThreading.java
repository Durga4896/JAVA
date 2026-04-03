package Threads;
import java.lang.Thread;
public class MultiThreading {
    public static void main(String[] dspy){
        System.out.println("Main Thread Started");
        System.out.println(Thread.activeCount()); // get number of active threads
        System.out.println(Thread.currentThread().getName()); // get name of the thread
        System.out.println(Thread.currentThread().getId()); // get id of the thread
        System.out.println(Thread.currentThread().getPriority()); // get priority of the thread
        System.out.println(Thread.currentThread().isAlive()); // check if the thread is alive
        System.out.println(Thread.currentThread().isDaemon()); // check if the thread is a daemon
        System.out.println(Thread.currentThread().isInterrupted()); // check if the thread is interrupted
        System.out.println(Thread.currentThread().getState()); // get state of the thread
        System.out.println("Main Thread Ended"); 

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(Thread.activeCount()); // get number of active threads

        Thread t5 = new Employee("E1");
        t5.start();

    }
}

class Employee extends Thread{
    public Employee(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Employee Thread Started");
        System.out.println("Thread " + Thread.currentThread().getName() + " Active Threads: " + Thread.activeCount());
    }
}
