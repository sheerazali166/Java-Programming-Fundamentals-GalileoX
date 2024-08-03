package packages_access_control_inheritance_polymorphism;

public class Animal {

    protected boolean hasEaten;

    public Animal() {
        this.hasEaten = false;
    }

    public void eat() {
        System.out.println("The animal is eating...");
        this.hasEaten = true;
    }
}
