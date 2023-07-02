package ThreadConcepts;

public class ThreadbyClass extends Thread {
    public void run(){
        for (int i=0; i<=10; i++){
            System.out.println(currentThread().getName() + ":" + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        ThreadbyClass example1 = new ThreadbyClass();
        ThreadbyClass example2 = new ThreadbyClass();
        example1.start();
        example2.start();

        example1.join();
        example2.join();

    }
}

