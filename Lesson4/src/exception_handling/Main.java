package exception_handling;

public class Main {

    public static void main(String[] args) throws Exception {

        // Limit 2000.00
        CreditCard limitCreditCard = new CreditCard(62656565, 2000.00);
        System.out.println("State Credit Card:");
        limitCreditCard.getStateCredit();

        try {
            System.out.println("Buying: $1500.00");
            limitCreditCard.buy(1500.00);

            System.out.println("State Credit Card");
            System.out.println(limitCreditCard.getStateCredit());

            System.out.println("Buying: $800.00");
            limitCreditCard.buy(800.00);

        } catch (ExceededCreditCardLimitException exceededCreditCardLimitException) {
            System.out.println("Buy Invalid, Exceeded Limit By: " + exceededCreditCardLimitException.getAmountExceeded());
            exceededCreditCardLimitException.printStackTrace(); // Stack Trace Print
        }

    }
}
