package ru.otus.java.basic.homeworks.homework_12_lesson_19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppIO {
    private File dir;
    private List<File> fileList;
    private String inputFileName;
    private String usersTextForFile;
    private String chooseToContinue;

    public static void createFilesInDirectory() throws IOException {
        for (int i = 1; i < 6; i++) {
            File file = new File("FilesForHomeWork12/FileText_" + i + ".txt");
            file.createNewFile();
        }
    }

    public void createListFiles() {
        dir = new File("FilesForHomeWork12");
        fileList = new ArrayList<>();
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                fileList.add(file);
            }
        }
    }

    public void printAllFilesName() {
        System.out.println("List of all available files: ");
        for (File file : dir.listFiles()) {
            if (checkTypeOfFile(file.getName())) {
                System.out.println(file.getName());
            }
        }
    }

    public boolean checkTypeOfFile(String fileName) {
        if (fileName.endsWith(".txt")) {
            return true;
        }
        return false;
    }

    public void inputNameFile() {
        System.out.println("Enter the name file: ");
        Scanner sc = new Scanner(System.in);
        inputFileName = sc.nextLine();
    }

    public void checkInputName() {
        boolean isNameFileCorrect = false;
        for (File file : dir.listFiles()) {
            if (file.getName().equals(inputFileName)) {
                System.out.println("You selected the file: " + file.getName());
                isNameFileCorrect = true;
                break;
            }
        }
        if(isNameFileCorrect == false) {
            System.out.println("There is no such file in the selected directory");
            inputNameFile();
            checkInputName();
        }
    }

    public void readTextFromSelectedFile() {
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(dir + "/" + inputFileName))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addUsersTextToSelectedFile() {
        System.out.println();
        System.out.println("Type the text necessary for add to the selected file: ");
        Scanner sc = new Scanner(System.in);
        usersTextForFile = " Added text -> " + sc.nextLine();

        byte[] buffer = usersTextForFile.getBytes(StandardCharsets.UTF_8);
        try(FileOutputStream out = new FileOutputStream(dir + "/" + inputFileName, true)) {
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isContinue() {
        System.out.println("Do you want to continue?: Y/N");
        Scanner sc = new Scanner(System.in);
        chooseToContinue = sc.nextLine();

        if(chooseToContinue.equals("Y")) {
            return true;
        }
        else if(chooseToContinue.equals("N")) {
            return false;
        } else {
            System.out.println("You entered the wrong character");
            isContinue();
        }
        return false;
    }

    public void continueWriteTextToSelectedFile(AppIO appIO) {
        while (chooseToContinue.equals("Y")) {
            appIO.printAllFilesName();
            appIO.inputNameFile();
            appIO.checkInputName();
            appIO.readTextFromSelectedFile();
            appIO.addUsersTextToSelectedFile();
            appIO.isContinue();
        }
    }

    public static void main(String[] args) throws IOException {
//        createFilesInDirectory();
        AppIO appIO = new AppIO();

        appIO.createListFiles();
        appIO.printAllFilesName();
        appIO.inputNameFile();
        appIO.checkInputName();
        appIO.readTextFromSelectedFile();
        appIO.addUsersTextToSelectedFile();
        appIO.isContinue();
        appIO.continueWriteTextToSelectedFile(appIO);
    }
}