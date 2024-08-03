package screencast_interfaces;

public class Main {

    public static void main(String[] args) {

        Car carTaxi = new Car(4);
        System.out.println("Car taxi has wheels? " + carTaxi.hasWheels() + " Number of wheels: " + carTaxi.getNumbersOfWheels());

        System.out.println(carTaxi.wheels);
        System.out.println(carTaxi.transportType);
    }
}
