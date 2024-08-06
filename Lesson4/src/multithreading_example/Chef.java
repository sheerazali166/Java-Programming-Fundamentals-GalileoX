package multithreading_example;

import java.util.Random;

public class Chef extends Thread {

    Random generatorRandom = new Random();
    private boolean aliveThread = true;

    @Override
    public void run() {
        super.run();

        int cookToTime = 0;
        int foodWich = 0;

        while (this.aliveThread) {
            cookToTime = 2000 + 1000 * generatorRandom.nextInt(3);

            try {
                this.sleep(cookToTime);
                foodWich = generatorRandom.nextInt(3);
                System.out.println("Chef On " + (cookToTime / 1000) + " seconds cook a ");

                switch (foodWich) {
                    case 0:
                        FoodStock.cookSellBurger("cook");
                        System.out.println("Burger");
                        break;
                    case 1:
                        FoodStock.cookSellSandwich("cook");
                        System.out.println("Sandwich");
                        break;
                    case 2:
                        FoodStock.cookSellSalad("cook");
                        System.out.println("Salad");
                        break;
                }
            } catch (InterruptedException interruptedException) {
                System.out.println("Chef Interrupted");
            }
        }
    }

    public void  end() {
        this.aliveThread = false;
    }
}
