package working_with_URLs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws Exception {
        URL oracleURL = new URL("https://www.oracle.com");
        BufferedReader readerBufferedInput = new BufferedReader(new InputStreamReader(oracleURL.openStream()));
        String lineInput;

        while ((lineInput = readerBufferedInput.readLine()) != null) {
            System.out.println(lineInput);
        }
        readerBufferedInput.close();
    }
}
