package ru.otus.java.basic.homeworks.homework_10_lesson_17;

import java.util.ArrayList;

import static ru.otus.java.basic.homeworks.homework_10_lesson_17.PhoneBook.add;
import static ru.otus.java.basic.homeworks.homework_10_lesson_17.PhoneBook.phoneBook;

public class Homework10 {

    public static void main(String[] args) {
        add("Илья", 8000001);
        add("Алексей", 8000002);
        add("Тимофей", 8000003);
        add("Владислав", 8000004);
        add("Юрий", 8000005);

        add("Илья", 8000001);

//        phoneBook.keySet().forEach(e -> System.out.println(e));
        for(String name: phoneBook.keySet()) {
            System.out.println(name + " : " + phoneBook.get(name));
        }
    }
}
