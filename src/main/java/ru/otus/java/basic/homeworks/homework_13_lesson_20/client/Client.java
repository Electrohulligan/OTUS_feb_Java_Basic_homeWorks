package ru.otus.java.basic.homeworks.homework_13_lesson_20.client;

import ru.otus.java.basic.homeworks.homework_13_lesson_20.util.ExampleClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8091)) {
                ExampleClient exampleClient = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
                String userMessage = scanner.nextLine();
                exampleClient.send(userMessage);

            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}