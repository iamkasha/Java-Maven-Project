package org.kasha.sample.Multithreading;

class Deadlock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: Acquired resource 1");
                    try {
                        Thread.sleep(100); // Introducing a delay to increase the chance of deadlock
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1: Acquired resource 2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: Acquired resource 2");
                    synchronized (resource1) {
                        System.out.println("Thread 2: Acquired resource 1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
