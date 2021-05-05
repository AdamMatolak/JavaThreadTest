package sk.kosickaakademia.matolak.twothreads;

public class Consumer extends Thread{
    private Thread t;
    @Override
    public synchronized void start() {
        if (t==null){
            t=new Thread(this,"consumer");
            t.start();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Hi, my name is consumer and I'm running");
            Thread.sleep(3000);
            System.out.println("woke up");
            synchronized (this){
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
