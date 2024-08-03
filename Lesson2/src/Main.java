import atm.ATM;
import bank.BankAccount;
import bank.BankTeller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        BankAccount bankAccount = new BankAccount(12345, 1000.00);
        BankTeller bankTellerJohn = new BankTeller();
        bankTellerJohn.deposit(bankAccount, 1000.00);

        ATM atmXYZ = new ATM(222);
        atmXYZ.withdraw(bankAccount, 70.00);
    }
}