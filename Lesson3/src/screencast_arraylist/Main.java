package screencast_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Program 1

        System.out.println("---------------Program 1---------------");


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Bannana");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input EXIT when you have finished");
        String item = "";

        do {
            item = scanner.next();

            if (!arrayList.contains(item) && !item.equals("EXIT")) {
                arrayList.add(item);
            }
        } while (!item.equals("EXIT"));

        System.out.println(arrayList);
    }
}
