package org.example;

public class MyThread extends Thread{

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup,name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2000);
                System.out.println("Я поток " + Thread.currentThread().getName() + " Всем привет!");
            }
        } catch (InterruptedException ignored) {

        } finally {
            System.out.println("Поток " + Thread.currentThread().getName() + " завершён");
        }
    }
}
