package org.example;


import java.util.concurrent.*;

public class Main {

    public static void main(String[] args ) throws InterruptedException, ExecutionException {
        ThreadGroup threadGroup = new ThreadGroup("Main group");
        Thread thread1 = new MyThread(threadGroup,"1");
        Thread thread2 = new MyThread(threadGroup,"2");
        Thread thread3 = new MyThread(threadGroup,"3");
        Thread thread4 = new MyThread(threadGroup,"4");
        System.out.println("Создаю потоки...");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(10000);
        System.out.println("Завершаю потоки...");
        threadGroup.interrupt();

    }
}
