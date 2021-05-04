package sk.kosickaakademia.matolak.javathreadtest;

public class PrimeNumberThread extends Thread{
    private Thread t;
    private String threadName;
    private int base;

    public PrimeNumberThread(String threadName, int base) {
        this.threadName = threadName;
        this.base = base;
        System.out.println("The thread named " + threadName + " has been created.");
    }

    @Override
    public void run() {
        System.out.println("Running thread named " + threadName);

        try{
            int number = base;
            while (number%2 != 0){
                number = number/2;
            }
            System.out.println("Closest prime number to " + base + " is: " + number);


        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread named " + threadName + " stopped.");
    }

    @Override
    public void start() {
        if (t==null){
            t=new Thread(this, threadName);
            t.start();
            System.out.println("The thread named " + threadName + " started");
        }
    }
}
