package SOLID_principles.linkov_substitution;

public class Fish extends Animal {

    public Fish(int basePrice, int suppliesPrice) {
        super("Fish", basePrice, suppliesPrice);
    }

    @Override
    public String getExtraSupplies() {
        return "\nFish bowl, Foood, Fungicide Drops";
    }

    @Override
    public String getBuyOptions() {
        return "Breeds: Beta, Koi, Angel\n\t";
    }
}
