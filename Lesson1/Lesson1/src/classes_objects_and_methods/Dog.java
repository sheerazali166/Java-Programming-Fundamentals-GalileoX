package classes_objects_and_methods;

public class Dog {

    int size;
    String name;

    public Dog(int inputSize, String inputName) {

        this.size = inputSize;
        this.name = inputName;
    }

    public void bark() {
        System.out.println("woof! woof!");
    }

    public void barkTwo() {
        String sound = "Woof";
        System.out.println(sound);
    }

    public void printName(String name) {
        System.out.println(name);
    }
}
