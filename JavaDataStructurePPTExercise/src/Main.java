import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        // Program 1

        System.out.println("-------------Program 1-------------");

        // Array
        // Array Creation

        int[] numbers1 = new int[3];

        // Array Creation
        // Example 2

        System.out.println("-------------Program 2-------------");

        int[] nums1 = new int[3];
        int[] nums2 = new int[] { 78, 23, 41 };

        System.out.println(23-78);
        System.out.println(23-41);
        System.out.println(41-78);
        System.out.println(-55-18-37);
        System.out.println(-55-18-37);


        // Program 3

        // Array Creation
        // Example 3

        System.out.println("-------------Program 3-------------");

        int[] nums3 = new int[3];
        int[] nums4 = new int[] { 78, 23, 41};
        int[] nums5 = { 78, 23, 41 }; // Shortcut


        // Program 4
        // Array

        System.out.println("-------------Program 4-------------");

        int[] trekkies1;
        int[] trekkies2;
        int trekikes3[];
        int trekikes4[];


        // Program 5
        // Array

        System.out.println("-------------Program 5-------------");

        int[] trekkies5;
        int[] trekkies6;
        int trekikes7[];
        int trekikes8[];


        // Program 6
        // Array

        System.out.println("-------------Program 6-------------");

        int[] trekkies9, trekkies10;

        //  vs

        int trekkies11[], trekkies12;

        // Program 7
        // java.util.arrays

        System.out.println("-------------Program 7-------------");
        System.out.println("-------------java.util.arrays-------------");

        String[] javaLanguages = { "Java", "Ceylon", "Kotlin" };
        System.out.println(javaLanguages.length); // 3

        System.out.println(javaLanguages[0]); // Java
        System.out.println(javaLanguages[1]); // Ceylon
        System.out.println(javaLanguages[2]); // Kotlin


        // Program 8
        // java.util.arrays - toString()

        System.out.println("-------------Program 8-------------");
        System.out.println("-------------java.util.arrays - toString()-------------");

        String[] javaLanguages2 = { "Java", "Ceylon", "Kotlin" };

        for (int i = 0; i < javaLanguages2.length; i++) {
            System.out.println(javaLanguages2[i]);
        }

        // Program 9
        // java.util.arrays - toString()

        System.out.println("-------------Program 9-------------");
        System.out.println("-------------java.util.arrays - toString()-------------");

        String[] javaLanguages3 = { "Java", "Ceylon", "Kotlin" };

        for (String javaLanguage: javaLanguages3) {
            System.out.println(javaLanguage);
        }

        // Program 10
        // java.util.arrays - toString()

        System.out.println("-------------Program 10-------------");
        System.out.println("-------------java.util.arrays - toString()-------------");


        String[] javaLanguages4 = { "Java", "Ceylon", "Kotlin" };
        System.out.println(Arrays.toString(javaLanguages4));

        // [Java, Ceylon, Kotlin]


        // Program 11
        // java.util.arrays - sort()

        System.out.println("-------------Program 11-------------");
        System.out.println("-------------java.util.arrays - sort()-------------");

        int[] numbers2 = { 6, 9, 1 };
        Arrays.sort(numbers2); // 1 6 9

        // Arrays are mutable


        // Program 12
        // java.util.arrays - binarySearch()

        System.out.println("-------------Program 12-------------");
        System.out.println("-------------java.util.arrays - binarySearch()-------------");

        int[] numbers3 = { 2, 7, 10, 16 };
        System.out.println(Arrays.binarySearch(numbers3, 2));

        // sort before search
        // otherwise result are unpredictable


        // Program 13
        // Varargs

        System.out.println("-------------Program 13-------------");
        System.out.println("-------------Varargs-------------");

        main2(javaLanguages);
        main3(javaLanguages2);
        main4(javaLanguages3);


        // Program 14
        // Multidimensional

        System.out.println("-------------Program 14-------------");
        System.out.println("-------------Multidimensional-------------");

        String[][] notSoSquare = new String[3][2];


        // Program 15
        // Multidimensional Example 2

        System.out.println("-------------Program 15-------------");
        System.out.println("-------------Multidimensional Example 2-------------");

        int[][] multidimensional = { {3, 4}, {9}, {6, 81, 789 } };

        System.out.println(multidimensional[2][0]);


        // Program 16
        // Multidimensional Example 3

        System.out.println("-------------Program 16-------------");
        System.out.println("-------------Multidimensional Example 3-------------");


        int[][] intNumbers = new int[3][2];

        for (int i = 0; i < intNumbers.length; i++) {
            for (int j = 0; j < intNumbers[i].length; j++) {
                System.out.println(intNumbers[i][j] + " u");
            }
            System.out.println(); // new row
        }


        // Program 17
        // ArrayList

        System.out.println("-------------Program 17-------------");
        System.out.println("-------------ArrayList-------------");

        ArrayList arrayListColl1 = new ArrayList();
        ArrayList arrayListColl2 = new ArrayList(10); // Allocation
        ArrayList arrayListColl3 = new ArrayList(arrayListColl2); // Copy


        // Program 18
        // Old Java ArrayList

        System.out.println("-------------Program 18-------------");
        System.out.println("-------------Old Java ArrayList-------------");

        ArrayList arrayList = new ArrayList();
        arrayList.add("Java"); // [Java]
        arrayList.add(Boolean.TRUE); // [Java, true]
        System.out.println(arrayList); // [Java, true]


        // Program 19
        // ArrayList

        System.out.println("-------------Program 19-------------");
        System.out.println("-------------ArrayList-------------");


        List<String> listStringLanguages = new ArrayList<String>();

        listStringLanguages.add("Java"); // [Java]
        listStringLanguages.add(1, "Ceylon"); // [Java, Ceylon]
        listStringLanguages.add(2, "Kotlin"); // [Java, Ceylon, Kotlin]
        listStringLanguages.add(3, "Groovy"); // [Java, Ceylon, Kotlin, Groovy]


        System.out.println(listStringLanguages);


        // Program 20
        // ArrayList - remove()

        System.out.println("-------------Program 20-------------");
        System.out.println("-------------ArrayList - remove()-------------");


        // First matching value
        List<String> listStringLanguages2 = new ArrayList<String>();

        listStringLanguages2.add("Java"); // [Java]
        listStringLanguages2.add("Java"); // [Java, Java]
        System.out.println(listStringLanguages2);
        System.out.println(listStringLanguages2.remove("Clojure")); // false
        System.out.println(listStringLanguages2.remove("Java")); // true
        System.out.println(listStringLanguages2.remove(0)); // Java
        System.out.println(listStringLanguages2);


        // Program 21
        // ArrayList - set()

        System.out.println("-------------Program 21-------------");
        System.out.println("-------------ArrayList - set()-------------");


        List<String> listStringLanguages3 = new ArrayList<String>();

        listStringLanguages3.add("Java"); // [Java]
        System.out.println(listStringLanguages3);
        System.out.println(listStringLanguages3.size()); // 1
        // listStringLanguages3.set(1, "Ceylon"); // [Java, Ceylon] // IndexOutOfBoundsException: Index: 1, Size: 1
        System.out.println(listStringLanguages3);
        System.out.println(listStringLanguages3.size()); // 1
        // listStringLanguages3.set(2, "Kotlin"); // IndexOutOfBoundsException: Index: 1, Size: 1
        System.out.println(listStringLanguages3.size()); // 1


        // Program 22
        // ArrayList - array

        System.out.println("-------------Program 22-------------");
        System.out.println("-------------ArrayList - array-------------");


        List<String> listStringLanguages4 = new ArrayList<String>();

        listStringLanguages4.add("Java");
        listStringLanguages4.add("Ceylon");

        System.out.println("List String Languages 4: " + listStringLanguages4);
        System.out.println("List String Languages 4 Size: " + listStringLanguages4.size()); // 2

        Object[] arrayObject = listStringLanguages4.toArray();

        System.out.println("Object Array: " + Arrays.toString(arrayObject));
        System.out.println("Object Array Length: " + arrayObject.length); // 2

        String[] arrayString = listStringLanguages4.toArray(new String[0]);

        System.out.println("Array String: " + Arrays.toString(arrayString));
        System.out.println("Array String Length: " + arrayString.length); // 2


        // Program 23
        // HashMap - put()

        System.out.println("-------------Program 23-------------");
        System.out.println("-------------HashMap - put()-------------");


        HashMap<Integer, String> hashMapLanguages = new HashMap<Integer, String>();

        hashMapLanguages.put(1995, "Java");
        hashMapLanguages.put(2011, "Ceylon");
        hashMapLanguages.put(2012, "Kotlin");

        System.out.println(hashMapLanguages);

        System.out.println(1995 - 2011);
        System.out.println(1995 - 2012);
        System.out.println(2011 - 2012);
        System.out.println(2012 - 2011);


        // Program 24
        // HashMap - putAll()

        System.out.println("-------------Program 24-------------");
        System.out.println("-------------HashMap - putAll()-------------");


        HashMap<Integer, String> hashMapMultipleLanguages = new HashMap<Integer, String>();

        hashMapMultipleLanguages.putAll(hashMapLanguages);
        System.out.println(hashMapMultipleLanguages);


        // Program 25
        // HashMap - get()

        System.out.println("-------------Program 25-------------");
        System.out.println("-------------HashMap - get()-------------");


        String theAlmightyLanguages = hashMapLanguages.get(1995);
        System.out.println(theAlmightyLanguages); // Java


        // Program 26
        // HashMap - remove()

        System.out.println("-------------Program 26-------------");
        System.out.println("-------------HashMap - remove()-------------");


        hashMapLanguages.remove(1995); // Java
        System.out.println(hashMapLanguages);

        System.out.println(Arrays.asList(hashMapLanguages));
        
        System.out.println("Bella is the best");
        System.out.println("That's correct wonderful job bella");
        System.out.println("Bravo");


    }

    public static void main2(String[] args) {

        System.out.println("main2() varargs: " + args);
        System.out.println("main2() varargs: " + args.toString());
        System.out.println("main2() varargs: " + args.length);

    }

    public static void main3(String args[]) {

        System.out.println("main3() varargs: " + args);
        System.out.println("main3() varargs: " + args.toString());
        System.out.println("main3() varargs: " + args.length);
    }

    public static void main4(String ... args) /* varargs */ {

        System.out.println("main4() varargs: " + args);
        System.out.println("main4() varargs: " + args.toString());
        System.out.println("main4() varargs: " + args.length);
    }
}