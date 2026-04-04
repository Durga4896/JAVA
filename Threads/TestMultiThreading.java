package Threads;

public class TestMultiThreading {
    public static void main(String[] dspy) {
        BrickDiary bd = new BrickDiary();

        Runnable r1 = () -> {
            for(int i=0; i<10000; i+=50){
                bd.incrementBrickCount();
            }
        };

        Runnable r2 = () -> {
            for(int i=0; i<10000; i+=50){
                bd.incrementBrickCount();
            }
        };

        Runnable r3 = () -> {
            for(int i=0; i<10000; i+=50){
                bd.incrementBrickCount();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        System.out.println(bd.brickCount);
        System.out.println(bd.brickCount2);
    }
}

class BrickDiary{
    int brickCount = 0;
    int brickCount2 = 0;
    public void incrementBrickCount(){
        synchronized (this){
            brickCount += 50;
        }
        brickCount2 += 50;
    }
}