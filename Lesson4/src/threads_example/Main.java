package threads_example;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread threadOneObject = new ThreadObject();
        Thread threadTwoAlterObject = new Thread(new ThreadAlterObject());

        threadOneObject.start();
        threadTwoAlterObject.start();

        // Thread.sleep(500);
        // threadOneObject.interrupt();
        // threadTwoAlterObject.interrupt();

        System.out.println("main thread will continue");
    }
}
