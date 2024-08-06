package exception_handling;

public class ExceededCreditCardLimitException extends Exception {

    private double amountExceeded;

    public ExceededCreditCardLimitException(double _amountExceeded) {
        this.amountExceeded = _amountExceeded;
    }

    public double getAmountExceeded() {
        return this.amountExceeded;
    }
}
