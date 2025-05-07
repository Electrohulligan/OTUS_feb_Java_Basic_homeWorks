package ru.otus.java.basic.homeworks.homework_13_lesson_20.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8091);
        System.out.println("Server APP started");
        while (true) {
            Socket client = socket.accept();
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            System.out.println("Client with port" + client.getPort() + " is connected to server");
            String userInput = inputStream.readUTF();
            System.out.println(userInput);
            int calculating = calculate(userInput);
            outputStream.writeUTF(String.valueOf(calculating));
            outputStream.flush();
            System.out.println("Server sent to client data of calculating:" + calculating);
        }

    }

    private static int calculate(String userInput) {
        String[] text = userInput.split(" ");
        if(text[1].equals("+")) {
            return Integer.parseInt(text[0]) + Integer.parseInt(text[2]);
        } else if(text[1].equals("-")) {
            return Integer.parseInt(text[0]) - Integer.parseInt(text[2]);
        } else if(text[1].equals("*")) {
            return Integer.parseInt(text[0]) * Integer.parseInt(text[2]);
        } else if(text[1].equals("/")) {
            try {
                return Integer.parseInt(text[0]) / Integer.parseInt(text[2]);
            }catch(ArithmeticException e) {
                System.out.println("Divide by zero");
                e.printStackTrace();
            }
        }
        return 0;
    }
}