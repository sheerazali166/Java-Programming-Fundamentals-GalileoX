public class Branching_Statement {

    public static void main(String[] args) {

        System.out.println("Starting the countdown!");

        System.out.println("Program 1");

        for (int i = 7; i >= 0 ; i--) {

            System.out.println(i);
            continue;

        }

        System.out.println("Program 2");

        for (int i = 7; i >= 0 ; i--) {

            System.out.println(i);
            break;

        }

        System.out.println("Program 3");

        int i;

        for (i = 7; i >= 0 ; i--) {

            System.out.println(i);

            if (i < 4) {

                continue;
            }

            System.out.println("beep");
        }

        System.out.println("Program 4");



        for (i = 7; i >= 0 ; i--) {

            System.out.println(i);

            if (i < 4) {

                break;
            }

            System.out.println("beep");
        }

    }
}
