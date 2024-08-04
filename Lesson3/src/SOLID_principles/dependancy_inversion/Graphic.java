package SOLID_principles.dependancy_inversion;

public class Graphic implements Input, Output {



    @Override
    public void getInput() {
        System.out.println("Get Mouse Click and Movement");
    }

    @Override
    public void sendOutput() {
        System.out.println("Show Data Graphically");
    }
}
