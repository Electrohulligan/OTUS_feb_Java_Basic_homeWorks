package ru.otus.java.basic.homeworks.homework_1_lesson3;

public class task_3 {
    public static void main(String[] args) {
        task_3.selectColor(21);
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        else if (data > 10 && data <= 20) {
            System.out.println("Жёлтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }
}
