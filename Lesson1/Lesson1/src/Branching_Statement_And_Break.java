public class Branching_Statement_And_Break {

    public static void main(String[] args) {

        int number = 1;
        loopNumber(1);

    }

    public static void loopNumber(int newNumber) {

        while (newNumber >= 0) {

            while (newNumber < 10) {

                newNumber++;
                continue;
            }

            System.out.println(newNumber);
            System.out.println("Done");
            break;
        }
    }
}
