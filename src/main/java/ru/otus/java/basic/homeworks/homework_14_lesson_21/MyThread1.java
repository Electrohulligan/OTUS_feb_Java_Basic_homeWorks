package ru.otus.java.basic.homeworks.homework_14_lesson_21;

import static ru.otus.java.basic.homeworks.homework_14_lesson_21.ArrayInThread.array2;
import static ru.otus.java.basic.homeworks.homework_14_lesson_21.ArrayInThread.createPartArray;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        createPartArray(0, array2.length/4);

    }
}
