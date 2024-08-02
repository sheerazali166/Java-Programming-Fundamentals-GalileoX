package choosing_the_correct_type;

public class Main {

    public static void main(String[] args) {

        Account accountAlice = new Account("Alice", (short)100);
        System.out.println(accountAlice);

        accountAlice.deposit((short)1000);
        System.out.println(accountAlice);

        accountAlice.deposit((short)40000);
        System.out.println(accountAlice);

    }
}
