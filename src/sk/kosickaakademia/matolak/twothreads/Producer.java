package sk.kosickaakademia.matolak.twothreads;

public class Producer extends Thread{
    private Thread t;
    @Override
    public void run() {

        try {
            System.out.println("Hello, my name is Producer and I'm running");
            synchronized (this){
                wait();
            }
            System.out.println("Running again");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void start() {
        if(t==null){
            t=new Thread(this, "producer");
            t.start();
        }
    }
}
