package SOLID_principles.linkov_substitution;

// Father Class
abstract class Animal {

    private String name;
    private int basePrice;
    private int suppliesPrice;

    public Animal(String _name, int _basePrice, int _suppliesPrice) {

        this.name = _name;
        this.basePrice = _basePrice;
        this.suppliesPrice = _suppliesPrice;

    }

    public String getName() {
        return this.name;
    }

    public String getCompletePrice() {
        return "Animal Price: $" + this.basePrice + ".00 + Supplies Price: $" + this.suppliesPrice +
                ".00\n\t Total Price: $" + (this.basePrice + this.suppliesPrice) + ".00";
    }

    public abstract String getExtraSupplies();
    public abstract String getBuyOptions();

}
