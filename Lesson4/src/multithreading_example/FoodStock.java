package multithreading_example;

public class FoodStock {

    private static int burger;
    private static int sandwich;
    private static int salad;

    public static synchronized boolean cookSellBurger(String stringAction) {

        if (stringAction.equals("cook")) {
            burger = burger + 1;
            return true;

        } else if (stringAction.equals("sell")){
            if (burger > 0) {
                burger = burger - 1;
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean cookSellSandwich(String stringAction) {
        if (stringAction.equals("cook")) {
            sandwich = sandwich + 1;
            return true;
        
        } else if (stringAction.equals("sell")) {
            if (sandwich > 0) {
                sandwich = sandwich - 1;
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean cookSellSalad(String stringAction) {
        if (stringAction.equals("cook")) {
            salad = salad + 1;
            return true;
        
        } else if (stringAction.equals("sell")) {
            if (salad > 0) {
                salad = salad - 1;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "\tFood Stock Burger: " + burger + " Sandwich: " + sandwich + " Salad: " + salad;
    }
}
