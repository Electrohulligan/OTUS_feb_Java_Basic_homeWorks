package ru.otus.java.basic.homeworks.homework_13_lesson_20.util;

import java.io.*;
import java.net.Socket;

public class ExampleClient implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }


    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
        try {
            String result = inputStream.readUTF();
            System.out.println(result);
        } catch (EOFException e) {
            System.out.println("the server has closed connection");
        }
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
