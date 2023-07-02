package org.kasha.sample.ThreadConcepts;

public class ThreadbyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<=10; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        ThreadbyRunnable runnableExample = new ThreadbyRunnable();

        Thread firstThread = new Thread(runnableExample);
        Thread secondThread = new Thread(runnableExample);

        firstThread.setName("Runnable first thread");
        secondThread.setName("Runnable second thread");

        firstThread.start();
        secondThread.start();
    }
}
