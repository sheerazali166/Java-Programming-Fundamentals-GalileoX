package choosing_the_correct_type;

public class Account {

    public static int nextAccount = 1;

    public String name;
    public int accountNumber;
    public short balance;

    public Account(String _name) {
        this.name = new String(_name);
        this.accountNumber = nextAccount;
        this.balance = 0;

        nextAccount++;
    }

    public Account(String _name, short _balance) {
        this.name = new String(_name);
        this.accountNumber = nextAccount;
        this.balance = _balance;

        nextAccount++;
    }

    public void deposit(short _balance) {
        this.balance = (short)(this.balance + _balance);
    }

    public String toString() {
        return "\nName: " + this.name + "\nAccount Number: " + this.accountNumber + "\nBalance: " + this.balance;
    }




}
