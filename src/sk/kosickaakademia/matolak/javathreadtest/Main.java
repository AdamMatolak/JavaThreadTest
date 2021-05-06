package sk.kosickaakademia.matolak.javathreadtest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");

        /*MyThread thread1 = new MyThread("Thread 1",3);
        thread1.start();

        MyThread thread2 = new MyThread("Thread 2",4);
        thread2.start();*/

        PrimeNumberThread pnt = new PrimeNumberThread("primeThread",20);
        pnt.start();

    }
}
