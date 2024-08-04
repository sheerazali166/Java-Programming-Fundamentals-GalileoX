package SOLID_principles.linkov_substitution;

import java.util.ArrayList;

public class PetShopInfoCenter {

    private static ArrayList<Animal> animalArrayListProductCatalogue = new ArrayList<Animal>();

    public static void addProduct(Animal animalPet) {
        animalArrayListProductCatalogue.add(animalPet);
    }

    public static String generateCatalogue() {

        String catalogue = "";

        for (Animal animalPet: animalArrayListProductCatalogue) {
            catalogue += animalPet.getName() + ":\n\t" +
                         animalPet.getCompletePrice() + "\n\t" +
                         animalPet.getExtraSupplies() + "\n\t" +
                         animalPet.getBuyOptions() + "\n\n";
        }

        return catalogue;
    }

}
