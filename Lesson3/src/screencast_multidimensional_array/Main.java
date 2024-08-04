package screencast_multidimensional_array;

public class Main {

    public static void main(String[] args) {

        // Program 1

        System.out.println("--------------Program 1--------------");


        String[][] pets = new String[2][3];

        pets[0][0] = "Chihuahua";
        pets[0][1] = "French Poodle";
        pets[0][2] = "Boxer";

        pets[1][0] = "Himalayan";
        pets[1][1] = "British Short-hair";
        pets[1][2] = "Siberian";

        for (int breed = 0; breed < pets.length; breed++) {
            for (int type = 0; type < pets[breed].length; type++) {
                System.out.println(pets[breed][type]);
            }
        }
    }
}
