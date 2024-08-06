package multithreading_example;

public class Customer {

    public int id;
    public int timeToDecide;
    public String desiredFood;

    public Customer(int _id, int _timeToDecide, String _desiredFood) {
        this.id = _id;
        this.timeToDecide = _timeToDecide;
        this.desiredFood = _desiredFood;
    }

    public String toString() {
        return "Customer #" + this.id;
    }
}
