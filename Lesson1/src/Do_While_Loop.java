public class Do_While_Loop {

    public static void main(String[] args) {

        System.out.println("While loop: starting...");

        int number = 2;

        while (number < 2) {
            System.out.println(number);
            number = number + 1;
        }

        System.out.println("While Loop: Done.");
        System.out.println("Do While Loop: Starting...");

        int numberTwo = 2;

        do {

            System.out.println(numberTwo);
            numberTwo = numberTwo + 1;

        } while (numberTwo < 2);

        System.out.println("Do While Loop: Done.");
    }
}
