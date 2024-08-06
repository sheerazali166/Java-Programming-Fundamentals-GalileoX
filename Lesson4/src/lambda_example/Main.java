package lambda_example;

public class Main {

    /**
     * Java old days demonstration *
    **/

    public void doItInTheOldWay() {

        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
            @Override
            public void doSomethingFunctional(String text) {
                System.out.println(text);
            }
        };
        myFunctionalInterface.doSomethingFunctional("Hello in the old way");
    }

    public void doItWithLambda() {

        MyFunctionalInterface myFunctionalInterfaceOne = (String stringX) -> System.out.println(stringX);
        myFunctionalInterfaceOne.doSomethingFunctional("Hello from lambda function");

        MyFunctionalInterface myFunctionalInterfaceTwo = (String stringXTwo) -> System.out.println(stringXTwo);
        myFunctionalInterfaceTwo.doSomethingFunctional("Hello from short syntax");

        MyFunctionalInterface myFunctionalInterfaceThree = stringXThree -> {
            myFunctionalInterfaceTwo.doSomethingFunctional("Hello from complex syntax");
            System.out.println(stringXThree);
            System.out.println("Bye from complex syntax");
        };
        myFunctionalInterfaceThree.doSomethingFunctional("Regular code in complex syntax");
        doSomethingHighOrder(myFunctionalInterfaceThree);

    }

    public void doSomethingHighOrder(MyFunctionalInterface behaviourMyFunctionalInterface) {
        behaviourMyFunctionalInterface.doSomethingFunctional("In high order way");
    }

    public static void main(String[] args) {

        // Calling the old implementation
        // MainInstance doItInTheOldWay()

        Main instanceMain = new Main();
        instanceMain.doItWithLambda();

        MyFunctionalInterface behaviourAMyFunctionalInterface = System.out::println;
        instanceMain.doSomethingHighOrder(behaviourAMyFunctionalInterface);

        MyFunctionalInterface behaviourBMyFunctionalInterface = stringXFour -> {
            stringXFour = "Doing something ".concat(stringXFour);
            System.out.println(stringXFour);
            System.out.println("Making java great again ");
        };
        instanceMain.doSomethingHighOrder(behaviourBMyFunctionalInterface);
    }
}
