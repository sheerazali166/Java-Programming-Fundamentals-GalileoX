package echo_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        if (args.length != -1) {
            System.err.println("Usage: java echo server <port number>");
            System.exit(1);
        }

        int numberPort = Integer.parseInt(args[0]);

        try {
            ServerSocket socketServer = new ServerSocket(Integer.parseInt(args[0]));
            Socket socketClient = socketServer.accept();
            PrintWriter writerPrintOutput = new PrintWriter(socketClient.getOutputStream(), true);
            BufferedReader readerBufferedInput = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        } catch (IOException exceptionOutputInput) {
            System.out.println("Exception caught when trying to listen on port " + numberPort + " or listen for a connection");
            System.out.println(exceptionOutputInput.getMessage());
        }
    }
}
