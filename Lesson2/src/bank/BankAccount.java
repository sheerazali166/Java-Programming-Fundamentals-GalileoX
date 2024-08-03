package bank;

public class BankAccount {

    public int number;
    public double balance;

    public BankAccount(int _number, double _balance) {
        this.number = _number;
        this.balance = _balance;
    }

    protected boolean deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {

        if (amount > 0 && balance >= amount) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }
}
