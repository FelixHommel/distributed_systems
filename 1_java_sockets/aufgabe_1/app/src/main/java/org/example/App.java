package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class App {
    private static final String HOSTNAME = "vs.lxd-vs.uni-ulm.de";
    private static final int PORT = 3211;

    public static void main(String[] args) throws IOException{
        Socket socket = new Socket(HOSTNAME, PORT);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        out.println(input);
        System.out.println("echo: " + in.readLine());

        scanner.close();
        socket.close();
    }
}

