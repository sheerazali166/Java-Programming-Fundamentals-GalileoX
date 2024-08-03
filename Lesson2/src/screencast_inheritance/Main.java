package screencast_inheritance;

public class Main {

    public static void main(String[] args) {

        Car carFerrari = new F1(320);
        Car carCop = new F1(220);

        carFerrari.printDescription();
        carCop.printDescription();

        System.out.println(carFerrari.topSpeed);
        System.out.println(carCop.topSpeed);
    }
}
