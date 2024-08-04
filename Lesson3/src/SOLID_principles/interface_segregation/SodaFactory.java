package SOLID_principles.interface_segregation;

public class SodaFactory implements ProductionDepartment, AdministrativeDevelopment, InvestigationDepartment {

    @Override
    public void administration() {

    }

    @Override
    public void accountancy() {

    }

    @Override
    public void createNewProduct() {

    }

    @Override
    public void costReduction() {

    }

    @Override
    public void manufacture() {

    }

    @Override
    public void transformRawMaterial() {

    }
}
