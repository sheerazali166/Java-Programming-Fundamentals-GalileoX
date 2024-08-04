package dynamic_data_structure;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Program 1

        // Dynamic Structures


        System.out.println("----------Program 1----------");
        System.out.println("----------Dynamic Structures----------");

        // ArrayList

        System.out.println("ArrayList:");
        ArrayList<String> dynamicArrayList = new ArrayList<String>();
        System.out.println(dynamicArrayList);


        // Program 2

        System.out.println("\n----------Program 2----------\n");


        System.out.println("Add an element to the ArrayLis:");
        dynamicArrayList.add("I'm Dynamic");
        System.out.println(dynamicArrayList);
        System.out.println("My size is: " + dynamicArrayList.size());


        // Program 3

        System.out.println("\n----------Program 3----------\n");


        System.out.println("Add a second element to the ArrayList:");
        dynamicArrayList.add("I'm Growing");
        System.out.println(dynamicArrayList);
        System.out.println("My size is: " + dynamicArrayList.size());


        // Program 3

        // String Pool

        System.out.println("----------String Pool----------");
        System.out.println("\n----------Program 3----------\n");


        System.out.println("Creating String I'm Growing and another one");

        String grow = "I'm Growing";
        String other = "Other";

        System.out.println("== compare the direction (pointer) of a object");
        System.out.println(grow == dynamicArrayList.get(0));
        System.out.println(other == dynamicArrayList.get(1));
        System.out.println("-----------------------");
        System.out.println("Dynamic ArrayList: " + dynamicArrayList);
        System.out.println("Grow: " + grow);
        System.out.println("Other: " + other);
        System.out.println("The two strings has the same value so, \nThe string pool of JVM assign the same direction to both strings");


        // Program 4

        // HashMap

        System.out.println("----------HashMap----------");
        System.out.println("\n----------Program 4----------\n");


        System.out.println("Empty HashMap:");
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        System.out.println(hashMap);
        hashMap.put(10, "I am Dynamic");
        System.out.println(hashMap);
        hashMap.put(25, "I am Growing");
        System.out.println(hashMap);


        // Program 5

        // String Pool Second

        System.out.println("----------String Pool Second----------");
        System.out.println("\n----------Program 5----------\n");


        System.out.println("See does not matter on what structure the string are stored");
        System.out.println("Starting: I am Growing");
        System.out.println(dynamicArrayList.get(1) == hashMap.get(10));
        System.out.println("Starting: I am Dynamic");
        System.out.println(dynamicArrayList.get(0) == hashMap.get(25));
        System.out.println("They all are just a reference to the string pool");


    }
}
