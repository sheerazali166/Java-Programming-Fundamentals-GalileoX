package functional_interfaces;

import java.text.DecimalFormat;

public class Product {

    public int id;
    public String name;
    public String category;
    public float price;

    public Product(int _id, String _name, String _category, float _price) {
        this.id = _id;
        this.name = _name;
        this.category = _category;
        this.price = _price;
    }

    public String toString() {
        return (this.name + (new DecimalFormat("$0.00")).format(this.price));
    }
}
