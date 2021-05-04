package sk.kosickaakademia.matolak.javathreadtest;

public class MyThread implements Runnable {

    private String threadName;
    private Thread t;
    private int priority;

    @Override
    public void run() {
        System.out.println("Running thread named " + threadName);
        //body of the thread
        try{
            for (int i = 1 ; i <= 10 ; i++){
                System.out.println("Thread named " + threadName + ": value: " + i);
                Thread.sleep(0);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread named " + threadName + " stopped.");
    }

    public MyThread(String threadName, int priority) {
        this.threadName = threadName;
        this.priority = priority;
        System.out.println("The thread named " + threadName + " has been created.");
    }

    public void start(){
        if (t==null){
            System.out.println("The thread named " + threadName + " started");
            t=new Thread(this, threadName);
            t.setPriority(priority);
            t.start();
        }
        else {
            System.out.println("You don't have a permission to start one thread twice");
        }
    }
}
