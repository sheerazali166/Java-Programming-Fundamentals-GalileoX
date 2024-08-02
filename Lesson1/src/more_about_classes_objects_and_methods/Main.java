package more_about_classes_objects_and_methods;

public class Main {

    public static void main(String[] args) {

        Account accountAlice = new Account("Alice", 100);
        Account accountBob = new Account("Bob");

        System.out.println(accountAlice);
        System.out.println(accountBob);

        System.out.println(accountAlice.nextAccount);
        System.out.println(accountBob.nextAccount);
        System.out.println(Account.nextAccount);

        System.out.println("--------------");

        // but why why
        System.out.println(3 * 3 * 3);
        System.out.println(3 + 3 + 3);
        System.out.println(9 - 27);
        System.out.println(9 + 27);
        System.out.println(9 * 27);
        System.out.println((float)9 / (float)27);
    }
}
