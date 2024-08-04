package screencast_simple_array;

public class Main {

    public static void main(String[] args) {

        // Program 1

        System.out.println("----------Program 1-----------\n");


        String[] maleStudents = new String[5];

        maleStudents[0] = "John";
        maleStudents[1] = "James";
        maleStudents[2] = "David";
        maleStudents[3] = "Charles";
        maleStudents[4] = "Joseph";

        System.out.println("Male Students:");

        for (int sequence = 0; sequence < maleStudents.length; sequence++) {
            System.out.println(sequence + 1 + ": " + maleStudents[sequence]);
        }

        // Program 2

        System.out.println("\n----------Program 2-----------\n");


        String[] femaleStudents = {"Susana", "Michelle", "Mary", "Sarah", "Ashley"};

        System.out.println("Female Students:");

        for (int sequenceTwo = 0; sequenceTwo < femaleStudents.length; sequenceTwo++) {
            System.out.println(sequenceTwo + 2 + ": " + femaleStudents[sequenceTwo]);
        }


        // Program 3

        System.out.println("\n----------Program 3-----------\n");


        String[] studentArray = new String[] {"Jason", "Liza", "Paul", "Gloria"};

        System.out.println("Student Array:");

        int sequenceThree = 3;

        System.out.println("------------For Loop 1-------------");

        for (String student: studentArray) {
            System.out.println(sequenceThree + ": " + student);
            sequenceThree = sequenceThree + 1;
        }

        System.out.println("------------For Loop 2-------------");

        for (String student: studentArray) {
            System.out.println(sequenceThree + ": " + student);
            sequenceThree = sequenceThree + 2;
        }

        System.out.println("------------For Loop 3-------------");

        for (String student: studentArray) {
            System.out.println(sequenceThree + ": " + student);
            sequenceThree = sequenceThree + 3;
        }

        System.out.println("------------For Loop 4-------------");

        sequenceThree = 4;

        for (String student: studentArray) {
            System.out.println(sequenceThree + ": " + student);
            sequenceThree = sequenceThree + 3;
        }

        System.out.println("------------For Loop 5-------------");

        sequenceThree = 5;

        for (String student: studentArray) {
            System.out.println(sequenceThree + ": " + student);
            sequenceThree = sequenceThree + 3;
        }
    }
}
