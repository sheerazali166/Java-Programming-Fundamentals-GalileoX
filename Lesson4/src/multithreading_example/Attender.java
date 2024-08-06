package multithreading_example;

public class Attender extends Thread {

    private int queueWich;
    private boolean aliveThread = true;

    public Attender(int _queueWich) {
        this.queueWich = _queueWich;
    }

    @Override
    public void run() {
        super.run();

        int decideToTime = 0;
        Customer customer;

        while (this.aliveThread) {
            customer = CustomerQueues.attendCustomer(this.queueWich);

            if (customer != null) {
                try {
                    this.sleep(customer.timeToDecide);
                    this.attend(customer);
                } catch (InterruptedException interruptedException) {
                    System.out.println("Attender Interrupted");
                }
            } else {
                try {
                    this.sleep(500);
                } catch (InterruptedException interruptedException) {
                    System.out.println("Attender Interrupted");
                }
            }
        }
    }

    public void attend(Customer customer) {

        boolean solid = true;
        int wait = 0;

        while (solid) {
            switch (customer.desiredFood) {
                case "Burger":
                    if (FoodStock.cookSellBurger("sell")) {
                        solid = false;
                    }
                    break;
                case "Sandwich":
                    if (FoodStock.cookSellSandwich("sell")) {
                        solid = false;
                    }
                    break;
                case "Salad":
                    if (FoodStock.cookSellSalad("sell")) {
                        solid = false;
                    }
                    break;
            }
            if (solid) {
                try {
                    this.sleep(2000);
                    wait = wait + 1;
                } catch (InterruptedException interruptedException) {
                    System.out.println("Attender Interrupted Wait Food");
                }
            }
        }
        System.out.println("Customer # " + (customer.id + 1) + " buy a " + customer.desiredFood +
                " and in " + (customer.timeToDecide / 1000) + " seconds and wait for food " + wait + " seconds");
    }

    public void end() {
        this.aliveThread = false;
    }
}
