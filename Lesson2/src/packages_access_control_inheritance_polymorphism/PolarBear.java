package packages_access_control_inheritance_polymorphism;

public class PolarBear extends Bear{

    public PolarBear() {
        super("White");
    }

    public PolarBear(String _color) {
        super(_color);
    }

    @Override
    public void eat() {
        super.eat();
    }
}
