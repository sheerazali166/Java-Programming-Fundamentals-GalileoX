package threads_example;

public class ThreadObject extends Thread {

    @Override
    public void run() {
        super.run();

        System.out.println("Hello from thread 1");
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException interruptedException) {
                System.out.println("Thread has been interrupted");
                Thread.currentThread().interrupt();
            }
            System.out.println("Count from thread 1 - " + i);
        }
    }
}
