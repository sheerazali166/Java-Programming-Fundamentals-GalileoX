package screencast_hashmap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Program 1

        System.out.println("------------Program 1------------");


        HashMap<Integer, String> monthsHashMap = new HashMap<Integer, String>();

        monthsHashMap.put(1, "January");
        monthsHashMap.put(2, "Fabuary");
        monthsHashMap.put(3, "March");
        monthsHashMap.put(4, "April");
        monthsHashMap.put(5, "May");
        monthsHashMap.put(6, "June");
        monthsHashMap.put(7, "July");
        monthsHashMap.put(8, "August");
        monthsHashMap.put(9, "September");
        monthsHashMap.put(10, "October");
        monthsHashMap.put(11, "November");
        monthsHashMap.put(12, "December");

        System.out.println(monthsHashMap.get(2));
        System.out.println(monthsHashMap.get(12));
        System.out.println(monthsHashMap.get(14)); // This will give you a null value


        // Program 2

        System.out.println("------------Program 2------------");


        HashMap<String, String> countriesHashMap = new HashMap<String, String>();

        countriesHashMap.put("CHN", "China");
        countriesHashMap.put("USA", "United States Of America");
        countriesHashMap.put("ESP", "Spain");
        countriesHashMap.put("GTM", "Guatemala");

        countriesHashMap.forEach((code, name) -> System.out.println("Code: " + code + " Name: " + name));

    }
}
