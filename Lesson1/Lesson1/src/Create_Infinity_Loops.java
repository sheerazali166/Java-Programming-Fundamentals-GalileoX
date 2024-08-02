public class Create_Infinity_Loops {

    public static void main(String[] args) {

        System.out.println("While Loop: Starting...");

        int number = 1;

        while (number > 0) {

            System.out.println(number);
            number = number + 1;
        }

        System.out.println("While Loop: Done.");
        System.out.println("Do While Loop: Starting...");

        int numberTwo = 1;

        do {

            System.out.println(numberTwo);
            numberTwo = numberTwo + 1;

        } while (numberTwo > 0);

        System.out.println("Do While Loop: Done.");

    }
}
