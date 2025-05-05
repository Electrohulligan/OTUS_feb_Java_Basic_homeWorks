package ru.otus.java.basic.homeworks.homework_10_lesson_17;

import java.util.*;

public class PhoneBook {
    public static Map<String, List<Integer>> phoneBook = new HashMap<>();

    public static void add(String name, Integer number) {
        if (phoneBook.containsKey(name) & phoneBook.containsValue(number)) {}
        if (!phoneBook.containsKey(name) & !phoneBook.containsValue(number)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(number);
//        if (phoneBook.containsKey(name) & !phoneBook.containsValue(number)) {
//            phoneBook.get(name).add(number);
//        }

    }

    public static void find(String name) {
        for (Map.Entry<String, List<Integer>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println("Данный номер " + entry.getValue() + " принадлежит владельцу по имени " + entry.getKey());
            }
        }
    }


//        Iterator<Map.Entry<String, List<Integer>>> iterator = phoneBook.entrySet().iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next().getKey().contains(name)) {
//                System.out.println("Данный номер " + iterator.next().getValue() +  "принадлежит владельцу по имени " + name);
//            }
//        }
//    }



    public static void containsPhoneNumber (Integer number) {
        Iterator<Map.Entry<String, List<Integer>>> iterator = phoneBook.entrySet().iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getValue().contains(number)) {
                System.out.println("Пользователь с таким номером " + number + " есть в справочнике: " + iterator.next().getKey());
            }
        }
    }

    public static void main(String[] args) {
        add("Илья", 8000001);
        add("Алексей", 8000002);
        add("Тимофей", 8000003);
        add("Тимофей", 8000023);
        add("Владислав", 8000004);
        add("Юрий", 8000005);
        add("Юрий", 8000005);

        add("Илья", 8000006);
        add("Илья", 8000007);

        for(String name: phoneBook.keySet()) {
            System.out.println(name + " : " + phoneBook.get(name));
        }
        System.out.println("----------------------------------------------------------------");

        find("Алексей");
        find("Тимофей");
        containsPhoneNumber(8000001);
//        containsPhoneNumber(8000023);
    }
}
