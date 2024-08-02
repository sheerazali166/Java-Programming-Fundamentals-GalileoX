public class Basic_For_Loop {

    public static void main(String[] args) {

        // basic example
        System.out.println("Basic Example");

        for (int sequence = 0; sequence < 10; sequence++ /* sequence = sequence + 2 */) {
            System.out.println(sequence);
        }

        System.out.println("Program 2");

        for (int sequence = 0; sequence < 10; sequence = sequence + 2 /* sequence = sequence + 2 */) {
            System.out.println(sequence);
        }

        System.out.println(24 - 68);
    }
}
