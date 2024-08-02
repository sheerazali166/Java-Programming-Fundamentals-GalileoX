public class Branching_Statement_And_Continue {

    public static void main(String[] args) {

        int number = 0;
        String value = loopNumber(number);
        number = 1;
        String valueTwo = loopNumber(number);

        System.out.println(value);
        System.out.println(valueTwo);

    }

    public static String loopNumber(int newNumber) {

        while (newNumber > 0) {

            if (newNumber < 10) {

                newNumber++;
                continue;
            }

            System.out.println(newNumber);
            return "Done";
        }
        return newNumber + " is negative";
    }
}
