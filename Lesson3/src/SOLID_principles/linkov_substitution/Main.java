package SOLID_principles.linkov_substitution;

public class Main {

    public static void main(String[] args) throws Exception {

        PetShopInfoCenter.addProduct(new Dog(180, 100, 15,
                "If you adopt supplies are free"));
        PetShopInfoCenter.addProduct(new Fish(15, 16));

        System.out.println(PetShopInfoCenter.generateCatalogue());
    }
}
