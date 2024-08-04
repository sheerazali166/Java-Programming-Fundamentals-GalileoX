package static_data_structure;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        // Program 1

        System.out.println("------------Program 1-------------\n");

        int[] intArray = new int[3];
        System.out.println("Array of primitive int:");
        System.out.println(Arrays.toString(intArray));


        // Program 2

        System.out.println("\n------------Program 2-------------\n");

        Integer integerArray[] = new Integer[3];
        System.out.println("Array Of Integer Object:");
        System.out.println(Arrays.toString(integerArray));


        // Program 3

        System.out.println("\n------------Program 3-------------\n");

        integerArray[1] = new Integer(5);
        System.out.println(Arrays.toString(integerArray));


        // Program 4

        System.out.println("\n------------Program 4-------------\n");

        Foo[] fooArray = { new Foo(1), new Foo(2), new Foo(3) };
        System.out.println("Array of Foo Object: ");
        System.out.println(Arrays.toString(fooArray));


        // Program 5

        System.out.println("\n------------Program 5-------------\n");

        fooArray[0] = null;
        System.out.println(Arrays.toString(fooArray));

    }
}
