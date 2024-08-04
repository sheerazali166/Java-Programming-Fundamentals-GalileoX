package SOLID_principles.linkov_substitution;

// Child Class
public class Dog extends Animal {

    private String otherRelatedData;
    private int obligatorySuppliesPrice;
    private int optionalSuppliesPrice;

    public Dog(int basePrice, int _obligatorySuppliesPrice, int _optionalSuppliesPrice, String _otherRelatedData) {

        super("Dog", basePrice, _obligatorySuppliesPrice + _optionalSuppliesPrice);
        this.otherRelatedData = _otherRelatedData;
        this.obligatorySuppliesPrice = _obligatorySuppliesPrice;
        this.optionalSuppliesPrice = _optionalSuppliesPrice;

    }

    @Override
    public String getExtraSupplies() {
        return "\tObligatory Vaccines: Food 50kg\t$(" +
                ".00)\tOptional: dog collar & harness\t($" +
                this.optionalSuppliesPrice + ".00)";
    }

    @Override
    public String getBuyOptions() {

        return "Breeds: Golden Retriever, Schnauzer, Husky\n\t" + this.otherRelatedData;
    }
}
