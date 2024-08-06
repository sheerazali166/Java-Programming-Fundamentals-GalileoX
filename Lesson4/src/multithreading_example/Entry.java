package multithreading_example;

import java.util.Random;

public class Entry extends Thread {

    Random generatorRandom = new Random();
    private static int idS;
    private boolean aliveThread = true;

    @Override
    public void run() {
        super.run();

        int enterCustomerTime = 0;

        while (this.aliveThread) {
            enterCustomerTime = 1000 + 1000 * generatorRandom.nextInt(3);

            try {
                this.sleep(enterCustomerTime);
                this.entry(enterCustomerTime);

            } catch (InterruptedException interruptedException) {
                System.out.println("Entry Interrupted");
            }
        }
    }

    public void entry(int enterCustomerTime) {

        int queueWich = generatorRandom.nextInt(2);
        int foodWich = generatorRandom.nextInt(3);
        int decideToTime = 1000 + 1000 * generatorRandom.nextInt(3);
        String nameFood = "";

        switch (foodWich) {
            case 0:
                nameFood = "Burger";
                break;
            case 1:
                nameFood = "Sandwich";
                break;
            case 2:
                nameFood = "Salad";
                break;
        }
        CustomerQueues.enterCustomer(queueWich, new Customer(idS = idS + 1, decideToTime, nameFood));
        System.out.println("Customer # " + idS + " enters " + (enterCustomerTime / 1000) +
                " seconds later to queue " + (queueWich + 1));
    }

    public void end() {
        this.aliveThread = false;
    }
}
