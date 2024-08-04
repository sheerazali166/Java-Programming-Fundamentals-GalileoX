package SOLID_principles.dependancy_inversion;

public class UserInterface {

    public static void getUserInput(Input input) {
        input.getInput();
    }

    public static void sendToUserOutput(Output output) {
        output.sendOutput();
    }

}
