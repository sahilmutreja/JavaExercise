package project;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * This program demonstrates a simple TCP/IP socket client.
 *
 * @author www.codejava.net
 */
public class Client {

    public static void main(String[] args) {
        if (args.length < 2) return;

        String hostname = args[0];
        int port = Integer.parseInt(args[1]);

        System.out.println(String.format("Connecting to machine = %s:%s",hostname,port));

        try (Socket clientSocket = new Socket(hostname, port)) {

            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            Console console = System.console();
            String text1, text2;

            do {
                text1 = console.readLine("Enter text1: "); // hello
                writer.println(text1);                         // send to server "hello"
                text2 = console.readLine("Enter text2: "); // world
                writer.println(text2);                         // send to server "hello"

                InputStream input = clientSocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String responseMessage = reader.readLine(); // World Hello
                System.out.println(responseMessage);

            } while(!(text1.equals("bye") && text2.equals("bye")));

            System.out.println("\nHope you had good time, see you again.");
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
