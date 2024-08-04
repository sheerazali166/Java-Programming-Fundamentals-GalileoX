package scanner_file;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Search for tokens, delimited
public class ScannerFile {

    public static void main(String[] args) throws Exception{

        Scanner inputScanner = null;

        String path = "/Users/sheeraz/Desktop/JAVA/Java Fundaments For Android/Lesson3/src/scanner_file/data/list_of_figures.txt";

        // Token per Token
        try {
            inputScanner = new Scanner(new BufferedReader(new FileReader(path)));

            while (inputScanner.hasNext()) {
                System.out.println("> " + inputScanner.next() + "\n");
            }
        } catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException(fileNotFoundException);
        } finally {
            if (inputScanner != null) {
                inputScanner.close();
            }
        }
    }
}
