package echo_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        // Right Handed English

        if (args.length != 2) {
            System.err.println("Usage: java echo client <hostname> <port number>");
            System.exit(1);
        }

         String nameHost = args[0];

         int numberPort = Integer.parseInt(args[1]);


        try {
            Socket socketEcho = new Socket(nameHost, numberPort);
            PrintWriter writerPrintOut = new PrintWriter(socketEcho.getOutputStream(), true);
            BufferedReader readerBufferedInput = new BufferedReader(new InputStreamReader(socketEcho.getInputStream()));
            BufferedReader readerBufferedStandardInput = new BufferedReader(new InputStreamReader(System.in));
            String inputUser;

            while ((inputUser = readerBufferedStandardInput.readLine()) != null) {
                System.out.println(inputUser);
                System.out.println("Echo: " + readerBufferedInput.readLine());
            }
        } catch (UnknownHostException exceptionHostUnknown) {
            System.err.println("Do not know about host: " + nameHost);
            System.exit(1);
        } catch (IOException exceptionOutputInput) {
            System.out.println("could not get Input/Output for the connection to: " + nameHost);
            System.exit(1);
        }
    }
}
