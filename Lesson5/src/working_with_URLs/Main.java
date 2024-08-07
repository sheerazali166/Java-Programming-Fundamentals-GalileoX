package working_with_URLs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws Exception {

        URL microsoftURL = new URL("https://www.microsoft.com/en-pk");
        URLConnection connectionURL = microsoftURL.openConnection();
        BufferedReader inputReaderBuffered = new BufferedReader(new InputStreamReader(connectionURL.getInputStream()));
        String lineInput;

        while ((lineInput = inputReaderBuffered.readLine()) != null) {
            System.out.println(lineInput);
        }
        inputReaderBuffered.close();
    }
}
