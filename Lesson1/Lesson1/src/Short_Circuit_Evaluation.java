public class Short_Circuit_Evaluation {

    public static void main(String[] args) {

        System.out.println("Let's check the first table...");

        boolean food = hotFood();
        boolean table = tableServed();

        /*hotFood() && tableServed()*/ /*tableServed() && hotFood()*/

        /*tableServed() || hotFood()*/ /*hotFood() || tableServed()*/ // this is more dangerous

        System.out.println("Program 1");

        if (table && food) {
            System.out.println("Time to eat");

        } else {

            System.out.println("Let's wait");
        }

        System.out.println("Program 2");

        if (table || food) {
            System.out.println("Time to eat");

        } else {

            System.out.println("Let's wait");
        }
    }


    public static boolean hotFood() {

        System.out.println("Evaluating Hot Food!");

        return true;
    }

    // without credit katal that is real meaning of freedom

    public static boolean tableServed() {

        System.out.println("Evaluating Table Served!");

        return false;
    }
}
