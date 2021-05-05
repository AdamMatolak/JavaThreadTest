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
            for(int i=base; i < (long)Math.pow(base,2); i++){
                boolean isPrime = true;
                for(int j=2; j < i ; j++){
                    if(i % j == 0){
                        isPrime = false;

                    }
                }
                if(isPrime){
                    System.out.println(i);
                    break;
                }

            }


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
