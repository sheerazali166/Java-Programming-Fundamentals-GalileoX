package classes_objects_and_methods;

public class Main {

    public static void main(String[] args) {

        // Program 1
        System.out.println("Program 1");

        Dog dog = new Dog(75, "Husky");
        System.out.println(dog.name);
        System.out.println(dog.size);

        dog.bark();
        dog.barkTwo();

        Dog dogTwo = new Dog(83, "German Shepherd");
        System.out.println(dogTwo.name);
        System.out.println(dogTwo.size);

        dogTwo.bark();
        dogTwo.barkTwo();

        Person person = new Person();
        person.printData("Super", "Man", 22);
        System.out.println(person.getName("Spider", "Man"));

    }
}
