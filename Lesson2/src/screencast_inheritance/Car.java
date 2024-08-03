package screencast_inheritance;

public class Car {

    public int topSpeed;

    public Car(int _topSpeed) {
        this.topSpeed = _topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void printDescription() {
        System.out.println("Car");
    }
}
