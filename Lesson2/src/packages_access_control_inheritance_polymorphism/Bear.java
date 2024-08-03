package packages_access_control_inheritance_polymorphism;

public class Bear extends Animal {

    public String color;

    public Bear(String _color) {
        super();
        this.color = _color;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("The bear went fishing before eating.");
    }
}
