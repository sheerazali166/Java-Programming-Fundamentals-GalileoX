package exception_handling;

public class CreditCard {

    private double availableCredit;
    private double limit;
    private int number;

    public CreditCard(int _number, double _limit) {
        this.number = _number;
        this.availableCredit = _limit;
        this.limit = _limit;
    }

    public void creditCardPaid(double amount) {
        this.availableCredit += amount;
    }

    public void buy(double amount) throws ExceededCreditCardLimitException{
        if (amount <= this.availableCredit) {
            this.availableCredit -= amount;

        } else {
            double exceeded = amount - this.availableCredit;
            throw new ExceededCreditCardLimitException(exceeded);
        }
    }

    public String getStateCredit() {
        return "Available Credit: $" + this.availableCredit + " Limit Credit: $" + this.limit;
    }

    public double getAvailableCredit() {
        return this.availableCredit;
    }

    public double getLimit() {
        return this.limit;
    }

    public int numberGet() {
        return this.number;
    }
}
