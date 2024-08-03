package packages_access_control_inheritance_polymorphism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Animal animalPolarBear = new PolarBear();
        Bear bearPolarBear = new PolarBear();

        animal.eat();
        animalPolarBear.eat();

        System.out.println(animal.hasEaten);
        // System.out.println(animalPolarBear.color);
        System.out.println(bearPolarBear.color);
    }
}
