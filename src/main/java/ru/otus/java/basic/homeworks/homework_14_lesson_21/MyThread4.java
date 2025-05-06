package ru.otus.java.basic.homeworks.homework_14_lesson_21;

import static ru.otus.java.basic.homeworks.homework_14_lesson_21.ArrayInThread.array2;
import static ru.otus.java.basic.homeworks.homework_14_lesson_21.ArrayInThread.createPartArray;

public class MyThread4 implements Runnable {
    @Override
    public void run() {
        createPartArray(array2.length-array2.length/4, array2.length);

    }
}
