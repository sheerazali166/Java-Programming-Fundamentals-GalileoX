
public class SwitchWithChoice {

    public static void main(String[] args) {

       // Program 1

        System.out.println("----------Program 1------------");

        int choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Creating...");
            case 2:
                System.out.println("Reading...");
            case 3:
                System.out.println("Updating...");
            case 4:
                System.out.println("Deleting...");
            default:
                System.out.println("Invalid Input");
        }

        // Program 2

        System.out.println("----------Program 2------------");

        choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Creating...");
                break;
            case 2:
                System.out.println("Reading...");
                break;
            case 3:
                System.out.println("Updating...");
                break;
            case 4:
                System.out.println("Deleting...");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
