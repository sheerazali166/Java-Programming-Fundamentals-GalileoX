package SOLID_principles.interface_segregation;

// Bad Implimentation
public interface Factory {

    public void administration();
    public void manufacture();
    public void accountancy();
    public void transformRawMaterial();
    public void createNewProduct();
    public void costReduction();
    public void logistics();
    public void distribution();

}
