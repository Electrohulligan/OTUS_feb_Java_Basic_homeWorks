package ru.otus.java.basic.homeworks.homework_11_lesson_18;

import java.util.*;

import static ru.otus.java.basic.homeworks.homework_11_lesson_18.Position.*;

public class PersonDataBase {
    public static List<Person> persons = new ArrayList<Person>();

    public static Person findById(Long id) {
        Set<Person> setPersons = new HashSet<>();
        setPersons.addAll(persons);
        for (Person person : setPersons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public static void add(Person person) {
        persons.add(person);
    }

    public static boolean isManager(Person person) {
        Set<Person> setPersons = new HashSet<>();
        setPersons.addAll(persons);
        for (Person person1 : setPersons) {
            if (person1.equals(person)) {
                return true;
            }
        }
        return false;
    }

    public static boolean  isEmployee(Long id) {
        Set<Person> setPersons = new HashSet<>();
        setPersons.addAll(persons);
        for (Person person2 : setPersons) {
            if (person2.getId() == id) {
                for (Position position : Position.values()) {
                    if(position != person2.getPosition()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        persons.add(new Person("Alex", MANAGER, 1L));
        persons.add(new Person("Max", DIRECTOR, 2L));
        persons.add(new Person("John", DRIVER, 3L));
        persons.add(new Person("Nicolas", ENGINEER, 4L));
        persons.add(new Person("Johny", SENIOR_MANAGER, 5L));
        persons.add(new Person("Sandra", DEVELOPER, 6L));
        persons.add(new Person("Kim", QA, 7L));
        persons.add(new Person("Steven", JANITOR, 8L));
        persons.add(new Person("Donald", PLUMBER, 9L));
        persons.add(new Person("Karl", BRANCH_DIRECTOR, 10L));
        persons.add(new Person("Josef", JUNIOR_DEVELOPER, 11L));

        for(Person person : persons) {
            System.out.println(person);
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println(findById(3l));
        add(new Person("Lucy", QA, 12l));

        for(Person person : persons) {
            System.out.println(person);
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println(isManager(persons.get(0)));
        System.out.println(isEmployee(10l));


    }
}