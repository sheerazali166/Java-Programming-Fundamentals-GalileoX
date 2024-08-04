package SOLID_principles.interface_segregation;

public class MaquilaFactory implements ProductionDepartment, DeliveryDepartment {
    @Override
    public void logistics() {

    }

    @Override
    public void distribution() {

    }

    @Override
    public void manufacture() {

    }

    @Override
    public void transformRawMaterial() {

    }
}
