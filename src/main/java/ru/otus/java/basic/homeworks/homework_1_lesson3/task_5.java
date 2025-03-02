package ru.otus.java.basic.homeworks.homework_1_lesson3;

public class task_5 {
    public static void main(String[] args) {
        task_5.addOrSubtractAndPrint(10, 20, false);
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if(increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
