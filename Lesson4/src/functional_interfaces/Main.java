package functional_interfaces;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Create a new grocery store list
        // Arrays.asList: Returns a fixed size list backed by the specified array
        // To be dynamic use linkedList
        List<Product> groceryStoreLinkedList = new LinkedList<Product>(
                Arrays.asList(
                        new Product(1, "Tomato", "Fruit", 1.75f),
                        new Product(2, "Avocado", "Fruit", 5f),
                        new Product(3, "Lemon", "Fruit", 0.5f),
                        new Product(4, "Onion", "Vegetable", 1.50f),
                        new Product(5, "Carret", "Vegetable", 1.25f),
                        new Product(6, "Broccoli", "Vegetable", 2f),
                        new Product(7, "Shrimp", "Seafood", 10.99f),
                        new Product(8, "Chicken", "Meat", 7.35f),
                        new Product(9, "Roast Beef", "Meat", 8.35f)
                )
        );

        // Print each of the products
        System.out.println("Original List:");
        groceryStoreLinkedList.forEach(product -> System.out.println(product));

        // Predicate filter of meat category
        Predicate<Product> predicateProductMeatRemover = (Product product) -> "Meat".equals(product.category);

        // Remove meat categories
        groceryStoreLinkedList.removeIf(predicateProductMeatRemover);

        // Print each of the products
        System.out.println("\nWithout Meat List:");
        groceryStoreLinkedList.forEach(product -> System.out.println(product));

        // Predicate filter of expensive product
        Predicate<Product> predicateProductExpensiveRemover = (Product product) -> product.price > 5f;

        // Remove expensive product
        groceryStoreLinkedList.removeIf(predicateProductExpensiveRemover);

        // Print each of the products
        System.out.println("\nWithout Expensive & Maet List:");
        groceryStoreLinkedList.forEach(product -> System.out.println(product));

        // Just filter first fruit with eliminating the other products
        System.out.println("Filter First Fruit:");
        System.out.println(groceryStoreLinkedList.stream()
                .filter((Product product) -> product.category.equals("Fruit")).findFirst());

        // Filter fruit new list
        System.out.println("Filter All Fruit:");
        System.out.println(groceryStoreLinkedList.stream()
                .filter((Product product) -> product.category.equals("Fruit")).collect(Collectors.toList()));

        // Print each of the products
        System.out.println("\nDon't eliminate the other products just filter:");
        groceryStoreLinkedList.forEach(product -> System.out.println(product));

    }
}
