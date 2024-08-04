package buffer_readers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// Just reading bytes
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReaderInput = null;
        BufferedWriter bufferedWriterOutput = null;

        String path = "/Users/sheeraz/Desktop/JAVA/Java Fundaments For Android/Lesson3/src/buffer_readers/data/list_of_figures.txt";

        // Byte per Byte
        try {
            bufferedReaderInput = new BufferedReader(new FileReader(path));
            bufferedWriterOutput = new BufferedWriter(new FileWriter(path));

            int character;

            while ((character = bufferedReaderInput.read()) != -1) {
                System.out.printf("0x%02X", character);
                System.out.println();
                System.out.write(character);
            }
        } finally {
            if (bufferedReaderInput != null) {
                bufferedReaderInput.close();
            }
            if (bufferedWriterOutput != null) {
                bufferedWriterOutput.close();
            }
        }

    }
}
