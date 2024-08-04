package SOLID_principles.dependancy_inversion;

public class CommandLine implements Input, Output{

    @Override
    public void getInput() {
        System.out.println("Get Commands");
    }

    @Override
    public void sendOutput() {
        System.out.println("Print data to terminal");
    }
}
