package SOLID_principles.dependancy_inversion;

public class Main {

    public static void main(String[] args) throws Exception {

        // Graphic UserInterface
        UserInterface.getUserInput(new Graphic());
        UserInterface.sendToUserOutput(new Graphic());

        System.out.println();

        // Command Line or Terminal UserInterface
        UserInterface.getUserInput(new CommandLine());
        UserInterface.sendToUserOutput(new CommandLine());

    }
}
