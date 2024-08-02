package more_about_classes_objects_and_methods;

public class Account {

    public static int nextAccount = 1;

    public String name;
    public int accountNumber;
    public int balance;

    public Account(String _name) {
        this.name = new String(_name);
        accountNumber = nextAccount;
        balance = 0;

        nextAccount++;
    }

    public Account(String _name, int _balance) {
        this.name = new String(_name);
        accountNumber = nextAccount;
        this.balance = _balance;

        nextAccount++;
    }

    public void deposit(int _balance) {
        this.balance = this.balance + _balance;
    }

    public String toString() {
        return "\nName: " + this.name + "\nAccount Number: " + this.accountNumber + "\nBalance: " + this.balance;
    }
}
