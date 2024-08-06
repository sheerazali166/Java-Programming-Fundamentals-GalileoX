package multithreading_example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner inputReaderScanner = new Scanner(System.in);
        String inputUser;

        Chef chef = new Chef();
        Entry comingCustomersEntry = new Entry();

        Attender oneAttender = new Attender(0);
        Attender twoAttender = new Attender(1);


        chef.start();
        comingCustomersEntry.start();
        oneAttender.start();
        twoAttender.start();

        // Stop with any key, except just enter
        while (true) {
            inputUser = inputReaderScanner.next();
            chef.end();
            comingCustomersEntry.end();
            oneAttender.end();
            twoAttender.end();
            System.exit(0);
        }

    }
}
